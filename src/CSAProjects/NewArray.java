package CSAProjects;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {
        //Q1
        double[] dude = new double[1028];
        //Q2
        double[][] twoDimensional = new double[5][4];
/*
        System.out.println(Arrays.deepToString(twoDimensional));
*/
        //Q3 and Q5
        String[][] studentSeating = {{"Bob,", "Joe", "Bobby"},
                {"Smushy", "Ryan", "Brian"},
                {"Dobby", "Harry", "Son"}};

        //Q6
/*
        System.out.println((studentSeating[1][2]));
*/
        //Q7
        //3 rows, 3 columns
        //0-based indexing
        studentSeating[1][2] = "Mr. Holley";

        //Q8
        //we need temp variable
        studentSeating[0][1] = "Bobby";
        studentSeating[0][2] = "Bob";

        //Q9
        //twice an hour for 10 hours
        double[][] temps = new double[2][10];

        //Q10
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            chessBoard[2][i] = "pawn";
            chessBoard[6][i] = "pawn";
        }

        //Q11
        int[][] data = new int[4][7];
        for (int j = 0; j < 7; j++) {
            data[2][j] = j + 1;
        }
/*
        System.out.println(Arrays.deepToString(data));
*/

        //Q12
        int[][] matrix = new int[6][8];
        for (int k = 0; k < 6; k++) {
            matrix[k][1] = matrix[k][4];
        }
/*
        System.out.println(Arrays.deepToString(matrix));
*/

        int[][] numbers = {{3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 7, 8}};
        mystery(numbers);
    }

    //Q13
    public static void mystery(int[][] ree) {
        for (int r = 0; r < ree.length; r++) {
            for (int c = 0; c < ree[0].length - 1; c++) {
                if (ree[r][c + 1] > ree[r][c]) {
                    ree[r][c] = ree[r][c + 1];
                }
            }
        }
    }
}
