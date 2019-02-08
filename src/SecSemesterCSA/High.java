package SecSemesterCSA;

public class High extends Middle {
    private String mathLvl;
    private String engLevel;
    private String sport;
    private boolean bibleTeaching;

    public High(int sAge, String nName, char sGender, boolean isReader, boolean isWriter, String sMathLevel, boolean sScience, boolean sIntMath, boolean sHistory,
                String sMathLvl, String sEngLevel, String sSport, boolean sBibleTeaching) {
        super(sAge, nName, sGender, isReader, isWriter, sMathLevel, sScience, sIntMath, sHistory);
        mathLvl = sMathLvl;
        engLevel = sEngLevel;
        sport = sSport;
        bibleTeaching = sBibleTeaching;
    }

    public void getMidStudent() {
        getStudent();
        getBasicStudent();
        System.out.println("Knows bible teachings: " + bibleTeaching + " Intermediate math: " + getMath() + " Knows history: " + getHistory());
    }

    public void getHighStudent() {
        getMidStudent();
        System.out.println("Math level: " + mathLvl + " English class: " + engLevel + " Sport: " + sport);
    }
}
