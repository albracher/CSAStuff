package PracticeStuff;

public class Advance extends Ticket {
    private int nrDays;
    private double ticketPrice;

    public Advance(int days) {
        //SUPER ALWAYS COMES FIRST
        super();
        nrDays = days;
    }

    public double getPrice() {
        if (nrDays < 10) {
            ticketPrice = 40.0;
        } else if (nrDays >= 10) {
            ticketPrice = 30.0;
        }
        return ticketPrice;
    }
}
