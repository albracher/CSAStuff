package SecSemesterCSA;

public class Rectangle {
    double length;
    double height;
    double perimeter;
    double area;

    public Rectangle(double x, double y) {
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

}
