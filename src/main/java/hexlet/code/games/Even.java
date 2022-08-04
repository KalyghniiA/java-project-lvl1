package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Even {
    private static final int MAX_NUM_RANDOM = 20;
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";
    private static Random rnd = new Random();
    public static void playingGame() {
        Map<String, String> conditions = new HashMap<>();

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int number = rnd.nextInt(MAX_NUM_RANDOM);
            String correctAnswer = number % 2 == 0 ? ANSWER_YES : ANSWER_NO;

            conditions.put(Integer.toString(number), correctAnswer);
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }
}
