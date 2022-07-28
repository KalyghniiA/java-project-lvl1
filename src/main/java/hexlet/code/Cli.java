package hexlet.code;


import java.util.Scanner;

public class Cli {
    public static void gettingToKnowUser(int gameNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.next();
        System.out.println("Hello, " + name);
        if (gameNumber == 2) {
            Even.playingGame(name);
        }
    }
}
