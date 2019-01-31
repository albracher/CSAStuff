package SecSemesterCSA;

public class MyClass {
   private int[][] data;

   public MyClass(int x, int y) {
       data = new int[x][y];
       for (int i = 0; i < x; i++) {
           int z = 1;
           for (int j = 0; j < y; j++) {
               data[i][j] = z;
               z *= i;
           }
       }
   }

   public int foo(int x, int y) {
       return data[x][y];
   }
}

