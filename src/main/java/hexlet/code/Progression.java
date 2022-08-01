package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    static final int MAX_START_NUM_RANDOM = 10;
    static final int MIN_ITERATION_RANDOM = 5;
    static final int MAX_ITERATION_RANDOM = 10;
    static final int MIN_MULTIPLIER_RANDOM = 1;
    static final int MAX_MULTIPLIER_RANDOM = 5;
    private static Random rnd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void playingGame() {
        String name = Cli.gettingToKnowUser();

        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String fullStringQuestion = createString();
            String[] elementsQuestion = fullStringQuestion.split(" ");
            int indexCorrectAnswer = getIndex(elementsQuestion);
            int correctAnswer = getCorrectAnswer(indexCorrectAnswer, elementsQuestion);
            String question = createQuestion(indexCorrectAnswer, elementsQuestion);
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

    static String createString() {

        int startingNumber = rnd.nextInt(MAX_START_NUM_RANDOM);
        int quantityIteration = Utils.getNumberToInterval(MIN_ITERATION_RANDOM, MAX_ITERATION_RANDOM);
        int multiplier = Utils.getNumberToInterval(MIN_MULTIPLIER_RANDOM, MAX_MULTIPLIER_RANDOM);

        String question = Integer.toString(startingNumber);

        for (var i = 0; i < quantityIteration; i++) {
            startingNumber += multiplier;
            question += " " + Integer.toString(startingNumber);
        }

        return question;
    }

    static String createQuestion(int index, String[] arr) {
        arr[index] = "..";
        return String.join(" ", arr);
    }

    static int getCorrectAnswer(int index, String[] arr) {
        return Integer.valueOf(arr[index]);
    }

    static int getIndex(String[] arr) {
        return rnd.nextInt(arr.length);
    }
}
