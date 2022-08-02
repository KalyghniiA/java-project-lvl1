package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    private static final int MAX_NUM_RANDOM = 10;
    private static Random rnd = new Random();
    public static void playingGame() {
        String name = Cli.gettingToKnowUser();

        System.out.println("What is the result of the expression?");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String example = createExample();
            int correctAnswer = gettingCorrectAnswer(example);

            boolean result = Engine.getResultGame(correctAnswer, example, name);
            if (!result) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    static String createExample() {

        String[] operators = {" + ", " - ", " * "};
        return Integer.toString(rnd.nextInt(MAX_NUM_RANDOM))
                + operators[rnd.nextInt(operators.length)]
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
