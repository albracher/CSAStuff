package CSAProjects;

public class TestingForEqualityBadExample {
    public static void main(String[] args) {
        int[] firstList = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] secondList = {2, 3, 44, 5, 6, 7, 2, 4};
        int[] thirdList = {1, 3, 3, 6, 5, 6, 8, 9};
        int[] fourthList = {2, 3, 44, 5, 6, 7, 2, 4};
        if (firstList.equals(secondList)) {
            return true;
        } else if (!firstList.equals(secondList)) {
                return false;
            }
        }
    }









    private static boolean equals(int[] Array1, int[] Array2) {
        if (Array1.length != Array2.length) {
            return false;
        }
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] != Array2[i]) {
                return false;
            }
        }
        return true;
    }
}



