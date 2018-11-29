//Allen Phu 2018, 10/5/18, 4 Exercises, Chapter 3 Programming Project
package Projects;

public class Chap3ProgrammingProject {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("The circumference is: " + roadTrip(25));

        //Exercise 2
        System.out.println("The distance between Baltimore and Manhattan is: " + Distance(29, 16, 34, 8));
        System.out.println("The distance between Los Pegasus and Neighagra Falls is: " + Distance(6, 19, 22, 7));
        System.out.println("The distance between the Badlands and Ponyville is: " + Distance(25, 24, 16, 14));

        //Exercise 3: Frozen North ---> Palomino ---> Canterlot
        System.out.println("The tour of Equestria is " + tour() + " square units.");

        //Exercise 4: Frozen North ---> Palomino ---> Canterlot --- > Frozen North
        //(15, 3) is Frozen North, (8, 20) is Palomino, (14, 8) is Canterlot
        System.out.println("The total trip of Equestria is" + totalTrip(15, 3, 8, 20, 14, 8) + " square units.");

    }
    //This calculates the circumference of parameter distance.
    private static double roadTrip(int distance) {
        double y = (distance * Math.PI);
        y = Math.floor(y);
        return y;
    }

    //This calculates the Distance between two points.
    private static double Distance(int x1, int y1, int x2, int y2) {
        //split up into two the two squares
        int xSquare = (x2 - x1) * (x2 - x1);
        int ySquare = (y2 - y1) * (y2 - y1);
        //two squares are added
        double DistValue = (xSquare + ySquare);
        //the values are square rooted
        return Math.sqrt(DistValue);
    }

    private static double tour() {
        //Exercise 3, 3-stop tour, locations located in main
        double x = Distance(15, 3, 8, 20);
        double y = Distance(8, 20, 14, 8);
        return x + y;

    }

    //This is actually Exercise 4 lol
    private static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3) {
        //this is where total trip is calculated, same locations as 3rd Exercise
        double blah = Distance(x1, y1, x2, y2);
        double moo = Distance(x2, y2, x3, y3);
        double baaaa = Distance(x3, y3, x1, y1);
        return blah + moo + baaaa;
    }
}