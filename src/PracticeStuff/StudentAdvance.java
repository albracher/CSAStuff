package PracticeStuff;

public class StudentAdvance extends Advance {
    //when you extend a class, it also takes along the previous variables
    public StudentAdvance (int days) {
        //SUPER ALWAYS COMES FIRST
        super(days);
    }

    public String toString() {
        return (super.toString() +  "\n(student ID required)");
    }

    public double getPrice() {
        return (super.getPrice() / 2);
    }
}
