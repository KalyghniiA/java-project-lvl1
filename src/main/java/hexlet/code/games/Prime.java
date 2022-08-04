package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class Prime {
    private static final int MIN_QUESTION_NUMBER = 1;
    private static final int MAX_QUESTION_NUMBER = 20;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String ANSWER_YES = "yes";
    static final String ANSWER_NO = "no";

    public static void playingGame() {
        Map<String, String> conditions = new HashMap<>();

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int question = Utils.getNumberToInterval(MIN_QUESTION_NUMBER, MAX_QUESTION_NUMBER);
            String correctAnswer = getCorrectAnswer(question) ? ANSWER_YES : ANSWER_NO;


            conditions.put(Integer.toString(question), correctAnswer);
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    private static boolean getCorrectAnswer(int number) {

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
