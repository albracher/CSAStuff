//Allen Phu P1, did 3 exercises on 11/13/18, practice for doing last problem on test
package CSAProjects;

public class Nov132018Stuff {
    public static void main(String[] args) {
        letters("Help");
        words("Yay, these are strings ");
        printShortWords("This is a rather difficult task ", 4);
    }

    // Exercise 1
    private static void letters(String str) {
        System.out.println();
        System.out.println("Exercise 1: ");
        int StringLength = str.length();
        for (int i = 0; i < StringLength; i++) {
            System.out.print(i + ":");
            System.out.println(" " + str.charAt(i));
        }
        System.out.println("Phrase = " + str);
    }

    //Edited version of Exercise 3, Question 4 from test
    //Exercise 2
    private static void words(String phrase) {
        System.out.println();
        System.out.println("Exercise 2: ");
        String space = ("");
        for (int k = 0; k < phrase.length(); k++) {
            char smallSpace = phrase.charAt(k);
            if (smallSpace != ' ') {
                space += smallSpace;
            } else {
                //make it less than phrase length rather than the extra number at the end, it uses the entire string
                if (space.length() <= phrase.length()) {
                    System.out.println(space);
                }
                space = "";
            }
        }
    }

    //problem 4 on test
    //Allen Phu P1, asked Rohan for help, made a lot more sense once began to use char instead of String
    //done on 11/12/18
    //Exercise 3
    private static void printShortWords(String newPhrase, int intMaxLength) {
        System.out.println();
        System.out.println("Exercise 3: ");
        String space = ("");
        //if k is less than the length of the string, add up until 1 less than string length
        for (int k = 0; k < newPhrase.length(); k++) {
            //checking each character
            char smallSpace = newPhrase.charAt(k);
            //if the character is a "space" then add it to the space variable
            if (smallSpace != ' ') {
                space += smallSpace;
            } else {
                if (space.length() <= intMaxLength) {
                    //if the length of a "Section" is less than the maximum length, then print it out
                    System.out.println(space);
                }
                space = "";
            }
        }
    }
}
