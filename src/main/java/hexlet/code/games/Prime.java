package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.utils.Utils;

import java.util.Scanner;

public class Prime {
    static final int MIN_QUESTION_NUMBER = 1;
    static final int MAX_QUESTION_NUMBER = 20;

    public static void playingGame() {
        String name = Cli.gettingToKnowUser();
        Scanner sc = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int questionNumber = Utils.getNumberToInterval(MIN_QUESTION_NUMBER, MAX_QUESTION_NUMBER);
            String correctAnswer = getCorrectAnswer(questionNumber) ? "yes" : "no";
            System.out.println("Question: " + Integer.toString(questionNumber));
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (!correctAnswer.equals(answer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let\'s try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }

    static boolean getCorrectAnswer(int number) {
        var max = Math.sqrt(number);
        for (var i = 2; i < max; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
