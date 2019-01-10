package SecSemesterCSA;

public class Student {
    String firstName;
    String lastName;
    double GPA;
    int totalUnits;

    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        GPA = 0.0;
        totalUnits = 0;
    }

    public String getName() {
        return (lastName + ", " + firstName);
    }

    public double getGPA() {
        return GPA;
    }

    public void newUnits(int units, double grade) {
        GPA = ((totalUnits * GPA + units * grade) / (1.0 * totalUnits + units));
        totalUnits += units;
    }
}
