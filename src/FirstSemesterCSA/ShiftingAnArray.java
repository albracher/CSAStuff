package FirstSemesterCSA;

import java.util.Arrays;

public class ShiftingAnArray {
    public static void main(String[] args) {
        //Declare an array of five elements
        int[] list = {1, 2, 3, 4, 5};
        System.out.println("OldList = " + Arrays.toString(list));
        ShiftArrayRight(list);
        System.out.println("NewList = " + Arrays.toString(list));

    }
    public static void ShiftArrayRight(int[] array) {
        int first = array[array.length-1];
        for (int i = array.length - 1; i >= 1 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = first;
    }
    public static void ShiftArrayLeft(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length - 1] = first;
    }
    public static void swap(int[] array) {
    }
}
