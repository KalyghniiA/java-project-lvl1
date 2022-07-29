package hexlet.code;

import java.util.Scanner;

public class App {
    public static final int MAX_QUANTITY_CORRECT_ANSWER = 3;
    static final int INDEX_GREET = 1;
    static final int INDEX_EVEN = 2;
    static final int INDEX_CALC = 3;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner gameNumberScanner = new Scanner(System.in);
        int gameNumber = gameNumberScanner.nextInt();
        System.out.println("Your choice: " + Integer.toString(gameNumber));
        System.out.println("Welcome to the Brain Games");
        switch (gameNumber) {
            case INDEX_GREET:
                Cli.gettingToKnowUser();
                break;
            case INDEX_EVEN:
                Even.playingGame();
                break;
            case INDEX_CALC:
                Calc.playingGame();
                break;
            default:
                return;
        }
    }
}
