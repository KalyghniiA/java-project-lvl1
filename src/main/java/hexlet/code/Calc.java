package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final int MAX_NUM_RANDOM = 10;
    public static void playingGame() {
        Scanner sc = new Scanner(System.in);
        String name = Cli.gettingToKnowUser();

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String example = createExample();
            int correctAnswer = gettingCorrectAnswer(example);
            System.out.println("Question: " + example);
            int answer = sc.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                return;
            }
            System.out.println("Congratulations, " + name + "!");
        }
    }

    static String createExample() {
        Random rnd = new Random();
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
