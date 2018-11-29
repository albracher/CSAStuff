package Projects;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your math question?");
        //For example, (1_2/3 + 4_5/6)
        String input = console.nextLine();
        System.out.println("Second Operand is: " + produceAnswer(input));
    }

   /* {
        // TODO: Read the input from the user and call produceAnswer with an equation

    }*/

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"




    //use the space instead of the Operand

    public static String produceAnswer(String input) {
        int spaceIndex = input.indexOf(" ");
        String firstOperand = input.substring(0, spaceIndex);
        //System.out.println("firstOperand = " + firstOperand);
        String secondOperand = input.substring(spaceIndex + 3);
        //System.out.println("secondOperand = " + secondOperand);
        return secondOperand;
    }
        /* if (input.indexOf("+") != -1) {
            int startToPlus = input.indexOf("+");
            String firstOperand = input.substring(0, startToPlus);
            String secondOperand = input.substring(startToPlus);
        } else if (input.indexOf("-") != -1) {
            int startToMinus = input.indexOf("-");
            String firstOperand = input.substring(0, startToMinus);
            String secondOperand = input.substring(startToMinus);
        } else if (input.indexOf("/") != -1) {
            int startToDiv = input.indexOf("/");
            String firstOperand = input.substring(0, startToDiv);
            String secondOperand = input.substring(startToDiv);
        } else if (input.indexOf("*") != -1) {
            int startToMult = input.indexOf("*");
            String firstOperand = input.substring(0, startToMult);
            String secondOperand = input.substring(startToMult);

        return secondOperand;
    }*/

}

 /*   {
        // TODO: Implement this function to produce the solution to the input

       // return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need

}
*/