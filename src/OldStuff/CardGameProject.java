package Projects;
import java.util.*;
public class CardGameProject {
    public static int sum;
    // ArrayList<Integer> allTheValues = new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("In this game, every card is it's value.");
        Scanner console = new Scanner(System.in);
//        int sum = 0;
        System.out.println("Would you like another card? Yes/No?");
        String decision = console.nextLine();
        //Asks user whether or not they want to continue
        if (decision.equals ("Yes") || decision.equals ("yes")) {
            int x = cardValue(whichCard());
            System.out.println("Your number is: " + x);
            sum = sum + x;
            System.out.println("Your sum is: " + sum);
            //Tests whether or not
            if (sum > 21) {
                System.out.println("Game over!");
            } if (sum == 21) {
                System.out.println("You automatically win!");
            }
            //start second Yes/No question, would you like to continue?
            System.out.println("Would you like to keep going? Yes or No?");
            String newDecision = console.nextLine();
            //init new y value
            int y = cardValue(whichCard());
            if (newDecision.equals ("No") || newDecision.equals ("no")) {
                score(sum);
            } else if (newDecision.equals ("Yes") || newDecision.equals ("yes")) {
                System.out.println("Your number is: " + y);
                sum = sum + y;
                System.out.println("Your sum is: " + sum);
                //Ask Second Question
                System.out.println("Would you like to keep going? Yes or No?");
                String anotherDecision = console.nextLine();
                int z = cardValue(whichCard());
                if (anotherDecision.equals ("No") || anotherDecision.equals ("no")) {
                    score(sum);
                } else if (anotherDecision.equals ("Yes") || anotherDecision.equals ("yes")) {
                    System.out.println("Your number is: " + z);
                    sum = sum + z;
                    System.out.println("Your sum is: " + sum);
                    if (sum > 21) {
                        System.out.println("Game over!");
                    } if (sum == 21) {
                        System.out.println("You automatically win!");


                    }
                }
                //Second Question Ends Here
            }
            System.out.println("Would you like to keep going? Yes or No?");
            String anotherDecision = console.nextLine();
            int z = cardValue(whichCard());
            if (newDecision.equals ("No") || newDecision.equals ("no")) {
                score(sum);
            } else if (newDecision.equals ("Yes") || newDecision.equals ("yes")) {
                System.out.println("Your number is: " + z);
                sum = sum + z;
                System.out.println("Your sum is: " + sum);
            }
            if (sum > 21) {
                System.out.println("Game over!");
            } if (sum == 21) {
                System.out.println("You automatically win!");
            }


            //this is where the first question ends
        } else if (decision.equals ("No") || decision.equals ("no")) {
            //reprogram to spit out the sum
            System.out.println("");

        }
    }

    //in pseudocode, score(int sum), sum = y
    private static String score(int y) {
        int computeParts = (int) (Math.random() * 5);
        if (computeParts >= y) {
            return ("You won, just barely.");
        } else if (computeParts <= sum) {
            return ("You lose! Sorry, bad luck!");
        } else if (computeParts == sum) {
            return ("Tie!");
        }
        return ("Something");
    }


    //this determines which card you have (52 cards in a deck)
    private static int whichCard() {
        int max = 51;
        int min = 0;
        double cardNum = (int) (Math.random()*((max-min)+1))+min;
        return (int) cardNum;
    }

    //int x = "num" from pseudo
    //this is the actual card value
    private static int cardValue(int x) {
        int ActualCardValue = (x / 4) + 2;
//    sum += ActualCardValue;
        return ActualCardValue;

    }
}