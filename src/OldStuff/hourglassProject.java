//Allen Phu P4 9/21/18, This program, hourglassProject, prints out an hourglass. Updated 9/30/18 with Constant
package hourglass;

public class hourglassProject {

    public static final int lineCount = 6;


    //This creates the "roof" of the program.
    public static void roof() {
        System.out.print("|");
        for (int i = 1; i <= (lineCount * 2) + 1 ; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
/*This is where "main" begins. It runs roof, the topHalf, the botHalf, then proceeds
    to print the roof again. */

    public static void main(String[] args) {
        roof();
        topHalf();
        botHalf();
        roof();
    }

    // This is where topHalf is made
    public static void topHalf() {
        //start of the whole loop
        for (int line = 0; line < lineCount; line++) {
            for (int Spaces = 1; Spaces < line + 1; Spaces++) {
                System.out.print(" ");
            }
            System.out.print(" \\");
            //beginning slash
            for (int colons = 1; colons <= lineCount - line - 1; colons++) {
                System.out.print("::");
                //2x+1 colon pattern
            }
            System.out.print(":/\n");
            //ending slash

        }

    }

    //this botHalf is similar to topHalf, but effectively, the design is reversed.
    public static void botHalf() {
        for (int newLine = 0; newLine < lineCount; newLine++) {
            for (int Space = 1; Space < lineCount - newLine; Space++) {
                System.out.print(" ");
            }
            System.out.print(" /");
            //print out slash to begin the line
            for (int Colon = 1; Colon <= newLine; Colon++) {
                System.out.print("::");
                //again, 2x+1
            }
            //prints single extra colon at the end, uses \n to move to next line
            System.out.print(":");
            System.out.print("\\\n");
            //print out another slash to end the line


        }
    }

}

//finished 20:05 using IntellJ IDEA, 9/24/18

