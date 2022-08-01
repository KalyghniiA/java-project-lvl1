package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    static final int MAX_NUM_RANDOM = 50;
    public static void playingGame() {
        String name = Cli.gettingToKnowUser();
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int firstNumber = rnd.nextInt(MAX_NUM_RANDOM);
            int secondNumber = rnd.nextInt(MAX_NUM_RANDOM);

            String question = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            int correctAnswer = gettingCorrectAnswer(firstNumber, secondNumber);


            System.out.println("Question: " + question);
            int answer = sc.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer != correctAnswer) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                return;
            }
            System.out.println("Correct!");
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
