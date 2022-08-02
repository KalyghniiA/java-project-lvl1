package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;


public class Gcd {
    private static final int MAX_NUM_RANDOM = 50;
    private static Random rnd = new Random();
    public static void playingGame() {
        String name = Cli.gettingToKnowUser();


        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int firstNumber = rnd.nextInt(MAX_NUM_RANDOM);
            int secondNumber = rnd.nextInt(MAX_NUM_RANDOM);

            String question = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            int correctAnswer = gettingCorrectAnswer(firstNumber, secondNumber);

            boolean result = Engine.getResultGame(correctAnswer, question, name);
            if (!result) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
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
