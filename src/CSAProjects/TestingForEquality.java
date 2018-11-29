package CSAProjects;

public class TestingForEquality {
    public static void main(String[] args) {
        int[] firstList = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] secondList = {2, 3, 44, 5, 6, 7, 2, 4};
        System.out.println("Do the first and second list equal each other? " + equals(firstList, secondList));
        int[] thirdList = {1, 3, 3, 6, 5, 6, 8, 9};
        int[] fourthList = {2, 3, 44, 5, 6, 7, 2, 4};
        System.out.println("Do the second and fourth list equal each other? " + equals(secondList, fourthList));
        System.out.println("Do the first and third list equal each other? " + equals(firstList, thirdList));
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



