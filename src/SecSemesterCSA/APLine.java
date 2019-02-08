package SecSemesterCSA;

// Declare the APLine class
public class APLine {
    private double aval;
    private double bval;
    private double cval;

    public APLine(int a, int b, int c) {
        this.aval = a;
        this.bval = b;
        this.cval = c;
    }

    public double getSlope() {
        return ((-1.0 * aval) / bval);
    }

    public boolean isonLine(int xval, int yval) {
        if (0 == ((aval * xval) + (bval * yval) + (cval))) {
            return true;
        } else {
            return false;
        }
    }
}
