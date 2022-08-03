package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Random;


public class Gcd {
    private static final int MAX_NUM_RANDOM = 50;
    private static Random rnd = new Random();
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void playingGame() {
        String[] conditions = new String[App.MAX_QUANTITY_CORRECT_ANSWER];

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int firstNumber = rnd.nextInt(MAX_NUM_RANDOM);
            int secondNumber = rnd.nextInt(MAX_NUM_RANDOM);

            String question = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            int correctAnswer = gettingCorrectAnswer(firstNumber, secondNumber);

            conditions[i] = question + "=" + Integer.toString(correctAnswer);
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    static int gettingCorrectAnswer(int firstNumber, int secondNumber) {
        int denominator = 1;

        for (var i = 1; i <= Math.min(firstNumber, secondNumber); i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                denominator = i;
            }
        }

        return denominator;
    }
}
