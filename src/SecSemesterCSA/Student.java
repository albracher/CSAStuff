package SecSemesterCSA;

public class Student {
    private String firstName;
    private String lastName;
    private double GPA;
    private int totalUnits;

    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        GPA = 0.0;
        totalUnits = 0;
    }

    public String getName() {
        return (lastName + ", " + firstName);
    }

    public String getFirstName() {
        return (firstName);    }

    public String getLastName() {
        return (lastName);
    }

    public double getGPA() {
        return GPA;
    }

    public void newUnits(int units, double grade) {
        GPA = ((totalUnits * GPA + units * grade) / (1.0 * totalUnits + units));
        totalUnits += units;
    }
}