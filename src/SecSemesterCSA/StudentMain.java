package SecSemesterCSA;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe");
        System.out.println(student1.getName());
        student1.newUnits(3, 2.4);
        System.out.println(student1.getGPA());
    }
}
