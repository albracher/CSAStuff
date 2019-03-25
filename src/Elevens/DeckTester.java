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

        String[] rank2 = {"jack", "queen", "king"};
        String[] suit2 = {"clubs", "spades", "diamonds"};
        int[] value2 = {10, 12, 13};
        Deck deck2 = new Deck(rank2, suit2, value2);

        System.out.println(deck1.size());
        System.out.println(deck1.deal());
    }

}
