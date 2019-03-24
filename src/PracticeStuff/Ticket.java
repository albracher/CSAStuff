package PracticeStuff;

public abstract class Ticket {
    private int serialNumber; //unique ticket id number

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    private static int getNextSerialNumber() {
        serialNumber = serialNumber + 1;
    }

    //get price for ticket
    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "/nPrice: " + getPrice();
    }
}