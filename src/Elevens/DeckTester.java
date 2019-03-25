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

        System.out.println(deck1.size());
        int deckSize = deck1.size();
        for (int i = 0; i <=deckSize; i++) {
            System.out.println("data:");
            System.out.println(deck1.size());
            System.out.println(deck1.deal());
            System.out.println(deck1.isEmpty());
        }
    }

}
