package FirstSemesterCSA;

public class PokemonChallenge {
    public static void main(String[] args) {
        System.out.println("Blastoise's HP is: " + HP(79));
        System.out.println("Blastoise's Attack is: " + Atk(83));
    }

    public static int HP(int BaseStat) {
        int y = (BaseStat * 2 + 110);
        return y;
    }

    public static int Atk(int BaseStat) {
        int y = (BaseStat * 2 + 5);
        return y;
    }

}





