package SecSemesterCSA;

import java.util.*;

public class TestBench {
    public static void main(String[] args) {

    }

    public void sort (int[] a) {
        int left = 0, right = a.length - 1;
        int k;

        while (left < right) {
            for (k = left + 1; k < right; k++) {
                if (a[k] < a[left]) {
                    swap(a, k, left);
                } else if (a[k] > a[right]) {
                    swap(a, k, right);
                }
                left++;
                right--;
            }
        }
    }
}
