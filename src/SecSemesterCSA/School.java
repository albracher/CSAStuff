package SecSemesterCSA;

public class School {
    private int age;
    private String name;
    private char gender;

    public School(int sAge, String sName, char sGender) {
        age = sAge;
        name = sName;
        gender = sGender;
    }

    public void getStudent() {
        System.out.println("Age is: " + age + " Name is: " + name + " Gender is: " + gender);
    }
}

