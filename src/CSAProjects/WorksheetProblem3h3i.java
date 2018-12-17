package CSAProjects;

import java.util.Arrays;

public class WorksheetProblem3h3i {
    public static void main(String[] args) {
        int counter = 0;
        int min = -10;
        int max = 10;
        int arrayLength = ((Math.abs(min) + Math.abs(max)) / 2);
        int[] newArray = new int[arrayLength];
        for (int i = min; i <= max; i++) {
            if (Math.abs(i) % 2 == 0) {
                counter+=0;
            } else if (Math.abs(i) % 2 == 1) {
                counter+=1;
                newArray[counter - 1] = i;
            }
            System.out.println("counter = " + counter);
        }
        System.out.println(Arrays.toString(newArray));
    }
}