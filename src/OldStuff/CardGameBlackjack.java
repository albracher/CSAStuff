package instate;
import java.util.Scanner;
public class CardGameBlackjack {
    //Made by Allen Phu, Karina Kleveland, and Anirudh (Rudy) Tanugula
    //This game is effectively Blackjack without the different suits.
    //It will ask the user if they wish to continue after each turn, if it's a no, it will spit out the sum
    public static int sum;

    //This calculates the card you're getting, for example
    //Are we getting the 49th card? The 25th card?
    public static int whichCard() {
        int max = 51;
        int min = 0;
        //Math.random within a range formula
        double cardNum = (int) (Math.random() * ((max - min) + 1)) + min;
        return (int) cardNum;
    }

    //This takes in the whichCard value, and uses a formula to determine a number for it
    //For example, cards have a set value they go through. This range is 2-14
    public static int cardValue(int x) {
        int ActualCardValue = (x / 4) + 2;
        return ActualCardValue;
    }
    //this basically calculates the score compared to that of computer if yse wants to quit out.
    //  public static String computerscorefunction(int k) {
    //String answer = "";
    // System.out.println("Well OK then, let's compute your score compared to my score...");
    //int computerscore = (int)(21 - Math.random()*5);
    //  System.out.println("Your score was " + sum + "computer score was " + k);
    // if (k < sum) {
    //   answer = "You win! Congrats, just barely ;)";
    //   return answer;
    //}else if (k > sum) {
    //    answer = "You lose! Too bad, better luck next time :/";
    //     return answer;
    //  }else if (k == sum) {
    //    answer = "Wow, a tie!! ";
    //return answer;
    //  }
    //  }
    //This is where the magic begins.
    public static void main(String[] args) {
        //Brief description of the code
        System.out.println("In this game, every card is it's value.");
        System.out.println("A spin-off of the classic game of Blackjack, don't go over 21. ");
        //We want to get a value to work with.
        //It's called cardValue because we want the value of the card.
        //Is it worth 5? Or is it worth 11? Who knows? It's random.
        int x = cardValue(whichCard());
        Scanner console = new Scanner(System.in);
        //Ask the user. Do they want a card?
        System.out.println("Would you like a card? Yes or no?");
        String decision = console.nextLine();
        //If the user says yes, goes on to loop
        if (decision.equals("Yes") || decision.equals("yes")) {
            System.out.println("Your card value is: " + x);
            //Tell them their card value, add it to the ongoing Sum
            sum += x;
            System.out.println("Your sum is: " + sum);
            //First turn is done, Second turn begins!
            System.out.println("Would you like to go again?");
            String secondTurn = console.nextLine();
            //They cannot get 21 on the first try, so ask them if they wish to continue
            if (secondTurn.equals("Yes") || secondTurn.equals("yes")) {
                //Reinitialize cardValue, so we don't get the same number every time.
                int y = cardValue(whichCard());
                System.out.println("Your card value is: " + y);
                sum += y;
                //Test to see if they have broken the threshold of 21 yet.
                //If so, then good for them.
                if (sum == 21) {
                    System.out.println("hold on... sum = " + sum + "!!!");
                    System.out.println("Good job! You won!");
                    //If not, then they get another try.
                    //This loop continues for a very long time because everything builds off of it.
                } else if (sum < 21) {
                    System.out.println("You are still under 21.");
                    System.out.println("Your current sum is: " + sum);
                    System.out.println("Would you like to keep playing?");
                    //Second turn is done, Third turn begins!
                    String thirdTurn = console.nextLine();
                    //Same thing, test to see if they want to keep going or not
                    if (thirdTurn.equals("Yes") || thirdTurn.equals("yes")) {
                        //Again, reinitialize cardValue so we don't get the same number every single time
                        int z = cardValue(whichCard());
                        System.out.println("Your card value is: " + z);
                        //Same pattern, add the number to the ongoing sum, and run the if test
                        sum += z;
                        //Same thing, if it's at 21, they win, if under, they can keep going, if at, they lost.
                        if (sum == 21) {
                            System.out.println("hold on... sum = " + sum + "!!!");
                            System.out.println("Good job! You won!");
                            //It's called fourthTurn because that is their FOURTH TURN
                        } else if (sum < 21) {
                            System.out.println("You're still in the game. Your current sum is: " + sum);
                            System.out.println("Would you like to keep playing? Yes or no?");
                            String fourthTurn = console.nextLine();
                            //Same thing, if they want to continue, they can.
                            if (fourthTurn.equals("Yes") || fourthTurn.equals("yes")) {
                                int f = cardValue(whichCard());
                                sum += f;
                                if (sum == 21) {
                                    System.out.println("hold on... sum = " + sum + "!!!");
                                    System.out.println("Good job! You won!");
                                } else if (sum < 21) {
                                    //Messages of encouragement if they're still going
                                    System.out.println("Wow! You're still in the game!");
                                    System.out.println("Your current sum is: " + sum);
                                    System.out.println("Would you like to keep going?");
                                    String fifthTurn = console.nextLine();
                                    //Fifth turn begins here
                                    if (fifthTurn.equals("Yes") || fifthTurn.equals("yes")) {
                                        int asdf = cardValue(whichCard());
                                        sum += asdf;
                                        System.out.println("Your current sum is: " + sum);
                                        if (sum == 21) {
                                            System.out.println("You won! What a god!");
                                        } else if (sum > 21) {
                                            System.out.println("You went over 21! Nice try!");
                                        } else if (sum < 21) {
                                            System.out.println("You're still in! Somehow!");
                                            System.out.println("Your current sum is: " + sum);
                                            System.out.println("Would you like to keep going?");
                                        }
                                        //From here on out, it's effectively a "you did not want to continue" graveyard.
                                    } else if (fifthTurn.equals("No") || fifthTurn.equals("no")) {
                                        System.out.println("You decided to stop at: " + sum);
                                        System.out.println("Well OK then, let's compute your score compared to my score...");
                                        int k = (int)(16 + Math.random()*5);
                                        System.out.println("Your score was " + sum + ", computer score was " + k);
                                        //System.out.println(computerscorefunction(k));
                                        System.out.println("Well OK then, let's compute your score compared to my score...");
                                        if (k < sum) {
                                            System.out.println("You win! Congrats, just barely ;)");
                                        }else if (k > sum) {
                                            System.out.println("You lose! Too bad, better luck next time :/)");
                                        }else if (k == sum) {
                                            System.out.println("Wow, a tie!! ");
                                        }

                                    }

                                } else if (sum > 21) {
                                    System.out.println("hold on... sum = " + sum);
                                    System.out.println("Oh no! You went over 21! Nice try!");
                                }
                            } else if (fourthTurn.equals("No") || fourthTurn.equals("no")) {
                                System.out.println("You decided to stop at: " + sum);
                                System.out.println("Well OK then, let's compute your score compared to my score...");
                                int k = (int)(16 + Math.random()*5);
                                System.out.println("Your score was " + sum + ", mine's " + k);
                                //System.out.println(computerscorefunction(k));

                                if (k < sum) {
                                    System.out.println("You win! Congrats, just barely ;)");
                                }else if (k > sum) {
                                    System.out.println("You lose! Too bad, better luck next time :/)");
                                }else if (k == sum) {
                                    System.out.println("Wow, a tie!! ");
                                }
                                //   return answer;
                                //}else if (k > sum) {
                                //    answer = "You lose! Too bad, better luck next time :/";
                                //     return answer;
                                //  }else if (k == sum) {
                                //    answer = "Wow, a tie!! ";
                                //return answer;
                            }


                        } else if (sum > 21) {
                            System.out.println("hold on... sum = " + sum);

                            System.out.println("Oh no! You went over 21! Nice try!");
                        }
                    } else if (thirdTurn.equals("No") || thirdTurn.equals("no")) {
                        System.out.println("You decided to stop at: " + sum);
                        System.out.println("Well OK then, let's compute your score compared to my score...");
                        int k = (int)(16 + Math.random()*5);
                        System.out.println("Your score was " + sum + ", mine's " + k);

                        if (k < sum) {
                            System.out.println("You win! Congrats, just barely ;)");
                        }else if (k > sum) {
                            System.out.println("Hahhahah, I'm closer to 21! You lose! Too bad, better luck next time :/)");
                        }else if (k == sum) {
                            System.out.println("Wow, a tie!! ");
                        }
                    }
                    //This is where the first loop ends.
                    //Remember, the first loop is super long because as long as the sum < 21, then you can keep going.
                } else if (sum > 21) {
                    System.out.println("hold on... sum = " + sum);
                    System.out.println("Oh no! You went over 21! Nice try! ");
                }
            } else if (secondTurn.equals("No") || secondTurn.equals("no")) {
                System.out.println("You decided to stop at: " + sum);
                System.out.println("Well OK then, let's compute your score compared to my score...");
                int k = (int)(16 + Math.random()*5);
                System.out.println("Your score was " + sum + ", mine's " + k);
                //System.out.println(computerscorefunction(k));

                if (k < sum) {
                    System.out.println("You win! Congrats, just barely ;)");
                }else if (k > sum) {
                    System.out.println("Hahhahah, I'm closer to 21! You lose! Too bad, better luck next time :/)");
                }else if (k == sum) {
                    System.out.println("Wow, a tie!! ");
                }
            }
        } else if (decision.equals("No") || decision.equals("no")) {
            System.out.println("lame. omg");


        }

    }

}


