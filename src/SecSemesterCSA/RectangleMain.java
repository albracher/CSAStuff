package SecSemesterCSA;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle Rect1 = new Rectangle(2.5, 6.5);
        System.out.println(Rect1.getArea());
        System.out.println(Rect1.getPerimeter());
        Rect1.doubleSize();
    }
}
