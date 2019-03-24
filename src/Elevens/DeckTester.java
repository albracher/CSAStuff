package Elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        String[] rank1 = {"jack", "queen", "king"};
        String[] suit1 = {"hearts", "spades", "diamonds"};
        int[] value1 = {11, 12, 13};
        Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("The size of Deck 1 is: " + deck1.size());

        String[] rank2 = {"jack", "queen", "king"};
        String[] suit2 = {"clubs", "spades", "diamonds"};
        int[] value2 = {10, 12, 13};
        Deck deck2 = new Deck(rank2, suit2, value2);
        System.out.println("Is Deck 2 empty? " + !deck2.isEmpty());

        String[] rank3 = {"five", "eight", "queen"};
        String[] suit3 = {"clubs", "spades", "hearts"};
        int[] value3 = {1, 3, 12};
        Deck deck3 = new Deck(rank3, suit3, value3);

        System.out.println(deck3);
    }

}
