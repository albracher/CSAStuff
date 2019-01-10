//Allen Phu - 10/8/18, Equestria Project P1
package FirstSemesterCSA;

public class Chap3ProgrammingProject {
    public static void main(String[] args) {
        //Exercise 1 - circumference exercise
        System.out.println("The trip's distance is: " + roadTrip(25) + " units");

        //Exercise 2
        System.out.println("The distance between Baltimore and Manhattan is: " + Distance(29, 16, 34, 8) + " units");
        System.out.println("The distance between Los Pegasus and Neighagra Falls is: " + Distance(6, 19, 22, 7) + " units");
        System.out.println("The distance between the Badlands and Ponyville is: " + Distance(25, 24, 16, 14) + " units");

        //Exercise 3: Frozen North ---> Palomino ---> Canterlot
        System.out.println("The tour of Equestria from Frozen North to Palomino to Canterlot is " +
                tour(15, 3, 8, 20, 14, 8) + " units");

        //Exercise 4: Frozen North ---> Palomino ---> Canterlot --- > Frozen North
        //(15, 3) is Frozen North, (8, 20) is Palomino, (14, 8) is Canterlot
        System.out.println("The total trip of Equestria, going from Frozen North to Palomino to Canterlot, returning back to Frozen North, " +
                "is " + totalTrip(15, 3, 8, 20, 14, 8) + " units");

        //Extra Credit
        //This uses the methods used in exercises 2-4, and adds one more location; Bronyville (made up)
        System.out.println("The total distance of this trip from Frozen North to Palomino to Canterlot to Bronyville, " +
                "returning to Frozen North, is: "
                + extraCredit(15, 3, 8, 20, 14, 8, 25, 24) + " units");
    }
    //This calculates the circumference of parameter distance.
    //Exercise 1
    private static double roadTrip(int distance) {
        double y = (distance * Math.PI);
        y = Math.floor(y);
        return y;
    }

    //This calculates the Distance between two points.
    //Exercise 2
    private static double Distance(int x1, int y1, int x2, int y2) {
        //split up into two the two squares
        int xSquare = (x2 - x1) * (x2 - x1);
        int ySquare = (y2 - y1) * (y2 - y1);
        //two squares are added
        double DistValue = (xSquare + ySquare);
        //the values are square rooted
        return Math.sqrt(DistValue);
    }

    private static double tour(int x1, int y1, int x2, int y2, int x3, int y3) {
        //Exercise 3, 3-stop tour, locations located in main
        double x = Distance(x1, y1, x2, y2);
        double y = Distance(x2, y2, x3, y3);
        return x + y;

    }

    //This is Exercise 4
    private static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3) {
        //this is where total trip is calculated, same locations as 3rd Exercise
        double blah = Distance(x1, y1, x2, y2);
        double moo = Distance(x2, y2, x3, y3);
        double baaaa = Distance(x3, y3, x1, y1);
        return blah + moo + baaaa;
    }

    private static double extraCredit(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double no = Distance(x1, y1, x2, y2);
        double nono = Distance(x2, y2, x3, y3);
        double nononono = Distance(x3, y3, x4, y4);
        double nonononono = Distance(x4, y4, x1, y1);
        return no + nono + nononono + nonononono;
    }
}

