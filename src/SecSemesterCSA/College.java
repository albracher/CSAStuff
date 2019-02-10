package SecSemesterCSA;

public class College extends High {
    private boolean canParty;
    private boolean canProcrastinate;
    private boolean canCheat;

    public College(int sAge, String nName, char sGender, boolean isReader, boolean isWriter, String sMathLevel, boolean sScience, boolean sIntMath, boolean sHistory,
                   String sMathLvl, String sEngLevel, String sSport, boolean sParty, boolean sProcrastinate, boolean sCheat) {
        super(sAge, nName, sGender, isReader, isWriter, sMathLevel, sScience, sIntMath, sHistory, sMathLvl, sEngLevel, sSport);
        canParty = sParty;
        canProcrastinate = sProcrastinate;
        canCheat = sCheat;
    }

    public void getCollegeStudent() {
        getStudent();
        getBasicStudent();
        getMidStudent();
        getHighStudent();
        System.out.println("Can party: " + canParty + " Can procrastinate: " + canProcrastinate + " Can cheat: " + canCheat);
    }
}


