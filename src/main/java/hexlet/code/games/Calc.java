package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Calc {
    private static final int MAX_NUM_RANDOM = 10;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static Random rnd = new Random();
    public static void playingGame() {
        Map<String, String> conditions = new HashMap<>();

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String question = createQuestion();
            int correctAnswer = gettingCorrectAnswer(question);

            conditions.put(question, Integer.toString(correctAnswer));
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    private static String createQuestion() {


        return rnd.nextInt(MAX_NUM_RANDOM)
                + OPERATORS[rnd.nextInt(OPERATORS.length)]
                + rnd.nextInt(MAX_NUM_RANDOM);
    }

    private static int gettingCorrectAnswer(String example) {
        String[] elementsExample = example.split(" ");
        switch (elementsExample[1]) {
            case "+":
                return Integer.valueOf(elementsExample[0]) + Integer.valueOf(elementsExample[2]);
            case "-":
                return Integer.valueOf(elementsExample[0]) - Integer.valueOf(elementsExample[2]);
            case "*":
                return Integer.valueOf(elementsExample[0]) * Integer.valueOf(elementsExample[2]);
            default:
                throw new Error("unknown operator");
        }
    }
}
