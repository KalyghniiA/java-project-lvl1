package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Prime {
    private static final int MIN_QUESTION_NUMBER = 1;
    private static final int MAX_QUESTION_NUMBER = 20;

    public static void playingGame() {
        String name = Cli.gettingToKnowUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int questionNumber = Utils.getNumberToInterval(MIN_QUESTION_NUMBER, MAX_QUESTION_NUMBER);
            String correctAnswer = getCorrectAnswer(questionNumber) ? "yes" : "no";


            boolean result = Engine.getResultGame(correctAnswer, Integer.toString(questionNumber), name);
            if (!result) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    static boolean getCorrectAnswer(int number) {

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
