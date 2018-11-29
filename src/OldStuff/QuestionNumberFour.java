//Allen Phu P1, asked Rohan for help, made a lot more sense once began to use char instead of String
package Projects;
import java.util.*;

public class QuestionNumberFour {
    public static void main(String[] args) {
        printShortWords("I love AP Computer Science!", 4);
        printShortWords("This is really hard for some reason!", 5);
    }

    private static void printShortWords(String str, int intMaxLength) {
        int SpaceNumber = 0;
        String space = ("");
        //if k is less than the length of the string, add up until 1 less than string length
        for (int k = 0; k < str.length(); k++) {
            //checking each character
            char smallSpace = str.charAt(k);
            //if the character is a "space" then add it to the space variable
            if (smallSpace != ' ') {
                space += smallSpace;
            } else {
                if (space.length() <= intMaxLength) {
                    //if the length of a "Section" is less than the maxlength, then print it out
                    System.out.println(space);
                }
                space = "";
            }
        }
    }
}
