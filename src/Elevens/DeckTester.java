package Elevens;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king", "ace"};
		String[] suits = {"blue", "red"};
		int[] values = {10, 10, 10, 11};

		Deck cardDeck = new Deck(ranks, suits, values);
		System.out.println(cardDeck.deal());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
