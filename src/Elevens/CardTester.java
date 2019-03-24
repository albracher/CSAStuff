package Elevens;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Clubs", 1);
		Card card2 = new Card("Ace", "Clubs", 1);
		Card card3 = new Card("King", "Spades", 13);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card3));
		System.out.println(card1.matches(card3));
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
