package FinalProject;

import java.util.Scanner;

public class WordGameClient {
    public static void main(String[] args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("Would you like to play a game?");
        String input = console.nextLine();
        gameOne(input);
    }
}
