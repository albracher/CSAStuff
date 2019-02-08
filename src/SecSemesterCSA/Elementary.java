package SecSemesterCSA;

public class Elementary extends School {
    private boolean knowsReading;
    private boolean knowsWriting;
    private String mathLevel;

    public Elementary(int age, String name, char gender, boolean sReader, boolean sWriter, String sMathLevel) {
        super(age, name, gender);
        knowsReading = sReader;
        knowsWriting = sWriter;
        mathLevel = sMathLevel;
    }

    public void getBasicStudent() {
        getStudent();
        System.out.println("Knows reading: " + knowsReading + " Knows writing: " + knowsWriting + " Math level: " + mathLevel);
    }
}
