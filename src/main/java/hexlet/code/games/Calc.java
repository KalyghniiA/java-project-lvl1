package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    private static final int MAX_NUM_RANDOM = 10;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static Random rnd = new Random();
    public static void playingGame() {
        String[] conditions = new String[App.MAX_QUANTITY_CORRECT_ANSWER];

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String question = createQuestion();
            int correctAnswer = gettingCorrectAnswer(question);

            conditions[i] = question + "=" + correctAnswer;
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    static String createQuestion() {


        return Integer.toString(rnd.nextInt(MAX_NUM_RANDOM))
                + OPERATORS[rnd.nextInt(OPERATORS.length)]
                + Integer.toString(rnd.nextInt(MAX_NUM_RANDOM));
    }

    static int gettingCorrectAnswer(String example) {
        String[] elementsExample = example.split(" ");
        if (elementsExample[1].equals("+")) {
            return Integer.valueOf(elementsExample[0]) + Integer.valueOf(elementsExample[2]);
        }
        if (elementsExample[1].equals("-")) {
            return Integer.valueOf(elementsExample[0]) - Integer.valueOf(elementsExample[2]);
        }
        if (elementsExample[1].equals("*")) {
            return Integer.valueOf(elementsExample[0]) * Integer.valueOf(elementsExample[2]);
        }
        return 0;
    }
}
