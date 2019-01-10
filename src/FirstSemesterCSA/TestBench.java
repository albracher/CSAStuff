package FirstSemesterCSA;

import java.util.Arrays;

public class TestBench {
    public static void main(String[] args) {
     int[] array = {2, 3, 4, 5, 6};
     array[3] = array[1];
     System.out.println(Arrays.toString(array));
    }
}
