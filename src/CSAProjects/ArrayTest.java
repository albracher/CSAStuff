package CSAProjects;
import java.util.*;

public class ArrayTest {
    public static void main(String args[]) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        arr[3] = 16;
        arr[6] = 8;
        arr[9] = 30;
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        printArray(arr);
    }

    public static void printArray(double[] arr) {
   /*     for (int i : arr) {
            System.out.println(i);
        }*/
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k] + " nope");
        }
            System.out.println(Arrays.toString(arr));
        }
    }

