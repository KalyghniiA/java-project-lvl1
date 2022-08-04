package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.HashMap;
import java.util.Map;


public class Gcd {
    private static final int MIN_NUM_RANDOM = 1;
    private static final int MAX_NUM_RANDOM = 50;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void playingGame() {
        Map<String, String> conditions = new HashMap<>();

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int firstNumber = Utils.getNumberToInterval(MIN_NUM_RANDOM, MAX_NUM_RANDOM);
            int secondNumber = Utils.getNumberToInterval(MIN_NUM_RANDOM, MAX_NUM_RANDOM);

            String question = firstNumber + " " + secondNumber;
            int correctAnswer = gettingCorrectAnswer(firstNumber, secondNumber);

            conditions.put(question, Integer.toString(correctAnswer));
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    private static int gettingCorrectAnswer(int firstNumber, int secondNumber) {
        int denominator = 1;

        for (var i = 1; i <= Math.min(firstNumber, secondNumber); i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                denominator = i;
            }
        }

        return denominator;
    }
}
