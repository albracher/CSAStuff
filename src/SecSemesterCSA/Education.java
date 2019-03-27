package SecSemesterCSA;

public class Education {
    private int age;
    private String name;
    private char gender;

    public Education(int sAge, String sName, char sGender) {
        age = sAge;
        name = sName;
        gender = sGender;
    }

    public void getStudent() {
        System.out.println("Age is: " + age + " Name is: " + name + " Gender is: " + gender);
    }
}

