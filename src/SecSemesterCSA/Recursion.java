package SecSemesterCSA;

public class Recursion {
    public static int Arithmetic(int n) {
        if (n == 1) {
            return 7;
        } else return Arithmetic(9 * (n - 1) + 7);
    }

    public static void main(String[] args) {
        System.out.println(Arithmetic(8));
    }
}
