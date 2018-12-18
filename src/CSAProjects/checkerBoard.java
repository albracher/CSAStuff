package CSAProjects;

import java.util.Arrays;

public class checkerBoard {
    public static void main(String[] args) {
        String board[][] = new String[8][8];
        initialize(board);
        System.out.println(Arrays.deepToString(board));
    }

    //i will be second number, for example, [row1] [i]
    public static void initialize(String[][] board) {
        for (int i = 0; i <= 7; i += 2) {
            for (int toprow = 0; toprow < 3; toprow += 2) {
                board[toprow][i] = "B";
            }
            for (int botrow = 5; botrow <= 7; botrow += 2) {
                board[botrow][i] = "R";
            }
        }
        for (int k = 1; k <= 7; k += 2) {
            board[1][k] = "B";
            board[6][k] = "R";
        }
    }
}
