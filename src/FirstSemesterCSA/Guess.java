//Allen Phu, Period 1, AP CSA, this is a guessing game, and will tell you if you're too high or low. Enjoy.
package FirstSemesterCSA;

import java.util.*;

public class Guess {
    public static void main(String[] args) {
        //prime all numbers before usage
        //prime maximum and minimum for the Random formula
        int max = 100;
        int min = 1;
        //counter for how many guesses it took you
        int counter = 0;
        int numberAnswer = (int) (Math.random() * ((max - min) + 1)) + min;
        //ask the user for their input
        Scanner console = new Scanner(System.in);
        System.out.println("Guess the number.");
        //next integer will be the decision
        int decision = console.nextInt();

        //this makes sure that it runs more than once if user gets it wrong
        while (decision != numberAnswer) {
            if (decision > numberAnswer) {
                System.out.println("Too high! Try again!");
                counter++;
                decision = console.nextInt();
            } else if (decision < numberAnswer) {
                System.out.println("Too low! Try again!");
                counter++;
                decision = console.nextInt();
            }
        }

        //after the while loop is done, the user has won!
        counter++;
        System.out.println("Good job! You guessed the number in " + counter + " guesses.");
    }
}
