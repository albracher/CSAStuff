package src;

import java.util.Scanner;

public class WordGameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
        System.out.println("Would you like to play a game?");
        String input = console.nextLine();
        WordGame.gameOne(input);

	}

}
