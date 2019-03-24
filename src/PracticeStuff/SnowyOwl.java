package PracticeStuff;

public class SnowyOwl extends Owl {
    private String randomFood;
    private int randomNum;

    public SnowyOwl(String name) {
        super(name);
    }

    public String getFood() {
        randomNum = (int) (Math.random() * (3 - 1 ) + 1);
        if (randomNum == 1) {
            randomFood = "hare";
        } else if (randomNum == 2) {
            randomFood = "lemming";
        } else if (randomNum == 3) {
            randomFood = "small bird";
        }
        return randomFood;
    }

}
