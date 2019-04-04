package Elevens;

import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
            {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
            {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     *
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     * false otherwise.
     */
    public boolean isLegal(List<Integer> selectedCards) {
        if (selectedCards.size() == 2) {
            return containsPairSum11(selectedCards);
            //you can only have a duo of cards to create 11
        } else if (selectedCards.size() == 3) {
            //JQK is 3 cards, so size can be 3
            return containsJQK(selectedCards);
        }
        return false;
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     *
     * @return true if there is a legal play left on the board;
     * false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        List<Integer> indexes = cardIndexes();
        //checks to see if it is impossible to return JQK, if so, then pair to 11 is possible
        if (!containsJQK(indexes)) {
            return containsPairSum11(indexes);
        }
        return true;
    }

    /**
     * Check for an 11-pair in the selected cards.
     *
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     * contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        int sizeCard = selectedCards.size();

        //if there are less than two cards on the board than there is no way that there can be a pair of 11
        if (sizeCard < 2) {
            return false;
        }
        //go through the entire deck, check each card with another using 2 for loops
        for (int i = 0; i < sizeCard - 1; i++) {
            for (int j = i + 1; j < sizeCard; j++) {
                //check point values with each other
                if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() == 11) {
                    return true;
                }
            }
        }
        //if none of the tests work, then of course it must be false
        return false;
    }

    /**
     * Check for a JQK in the selected cards.
     *
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     * include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        boolean hasJack = false;
        boolean hasQueen = false;
        boolean hasKing = false;
        //prime all three card booleans

        //it is physically impossible to have JQK if there are less than 3 cards
        if (selectedCards.size() < 3) {
            return false;
        }

        //go through the entire deck and check 1 by 1 if you have a jack, queen, and king
        for (int i = 0; i < selectedCards.size(); i++) {
            if (cardAt(selectedCards.get(i)).rank() == "jack") {
                hasJack = true;
            } else if (cardAt(selectedCards.get(i)).rank() == "queen") {
                hasQueen = true;
            } else if (cardAt(selectedCards.get(i)).rank() == "king") {
                hasKing = true;
            }
        }
        //if you have all three, it's true! if you don't have all 3, it's false.
        return (hasJack && hasQueen && hasKing);
    }
}
