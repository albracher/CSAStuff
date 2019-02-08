package SecSemesterCSA;

public class Rectangle {
    private double length;
    private double height;
    private double perimeter;
    private double area;

    public Rectangle(doub
                             le x, double y) {
        length = x;
        height = y;
        perimeter = (2 * length) + (2 * height);
        area = (length * height);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void doubleSize() {
        length *= 2;
        height *= 2;
    }

}
