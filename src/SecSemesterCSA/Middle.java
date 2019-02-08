package SecSemesterCSA;

public class Middle extends Elementary {
    private boolean knowsScience;
    private boolean intermediateMath;
    private boolean knowsHistory;

    public Middle(int sAge, String nName, char sGender, boolean isReader, boolean isWriter, String sMathLevel, boolean sScience, boolean sIntMath, boolean sHistory) {
        super(sAge, nName, sGender, isReader, isWriter, sMathLevel);
        knowsScience = sScience;
        intermediateMath = sIntMath;
        knowsHistory = sHistory;
    }

    public boolean getMath() {
        return intermediateMath;
    }

    public boolean getHistory() {
        return knowsHistory;
    }

    public void getMidStudent() {
        getStudent();
        getBasicStudent();
        System.out.println("Knows science: " + knowsScience + " Intermediate math: " + intermediateMath + " Knows history: " + knowsHistory);
    }

}
