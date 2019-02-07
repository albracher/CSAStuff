package SecSemesterCSA;

public class High extends Middle {
    private String mathLvl;
    private String engLevel;
    private String sport;

    public High(int sAge, String nName, char sGender, boolean isReader, boolean isWriter, String sMathLevel, boolean sScience, boolean sIntMath, boolean sHistory,
                String sMathLvl, String sEngLevel, String sSport) {
        super(sAge, nName, sGender, isReader, isWriter, sMathLevel, sScience, sIntMath, sHistory);
        mathLvl = sMathLvl;
        engLevel = sEngLevel;
        sport = sSport;
    }

    public void getHighStudent() {
        getStudent();
        getBasicStudent();
        getMidStudent();
        System.out.println("Math level: " + mathLvl + " English class: " + engLevel + " Sport: " + sport);
    }
}
