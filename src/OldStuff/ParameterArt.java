//created by Allen Phu, 10/3/18 - program prints out last name, letters going vertically
//finished 10/3/18 18:54 - intelliJ iDEA
package Projects;

public class ParameterArt {

    //sBL stands for SpacesBetweenLetters
    //edit these values to have some fun
    public static final int sBL = 3;
    public static final int size = 15;


    public static void main(String args[]) {
        //here, parameters are used to simplify the code
        letterP(size, 'P');
        Spaces();
        letterH(size, 'H');
        Spaces();
        letterU(size, 'U');
    }

    //Spaces is used to space out the gap between letters, sBL is above, whatever sBL is will be the amt of spaces
    public static void Spaces() {
        for (int iBLS = 1; iBLS <= sBL; iBLS++) ;
        System.out.println("");
    }


    //letterP begins here
    public static void letterP(int num, char ch) {
        /*This is where the top row of P is output, the constant size is subtracted by 2 in order to
        get the number of letter Ps we want to print across */
        for (int i = 1; i <= num - 2; i++) {
            System.out.print(ch);
        }

        //now, we will begin on the second row of the full P, we want to do println to go to the next line
        System.out.println("");

        //print one P to start off the second row, because we need the space in between
        System.out.print(ch);
        /*now that we have the starting p, we want to have the space in between the two Ps for the second row
        we want first and second p to be where the first row begins and ends, so we will print spaces separately*/
        for (int j = 1; j <= num - 4; j++) {
            System.out.print(" ");
        }
        //print final P to close out the second row
        System.out.println(ch);

        //same thing as first row, repeated
        for (int k = 1; k <= num - 2; k++) {
            System.out.print(ch);
        }

        //println to space out the letters
        System.out.println("");

        /*this is pretty easy, just finish out the first column of Ps, keeping the first three rows in mind
        remember height should be equal to the class constant size, so we do size - 3 because we want to subtract
        the first 3 rows, programmed separately
        */
        for (int asdf = 1; asdf <= num - 3; asdf++) {
            System.out.println("P");
        }
    }


    //now we can finally work on letterH
    public static void letterH(int num, char ch) {
        /*it begins to get complicated here
        we want the same number of spaces in between the two Hs to be the same as the middle H line
        but we want height to be the same as constant size, so -4 */
        for (int i = 1; i <= num - 4; i++) {
            //print out the first H
            System.out.print(ch);

            //similar code to the P, we want to have the right # of spaces
            for (int j = 1; j <= num - 4; j++) {
                System.out.print(" ");
            }
            //after printing spaces, print second H
            System.out.println(ch);

        }
        //print middle line
        for (int ls = 1; ls <= num - 2; ls++) {
            System.out.print(ch);
        }
        //skip to next line after printing middle H line
        System.out.println("");

        //same thing as above but with different method names
        for (int rawr = 1; rawr <= num - 4; rawr++) {
            System.out.print(ch);
            for (int bm = 1; bm <= num - 4; bm++) {
                System.out.print(" ");
            }
            System.out.println(ch);
        }

    }


    /*letterU begins here, it's basically letterH but instead of Letters with Spaces, Line of Letters, LwS again, it's
    Spaces, Line of Letters */
    public static void letterU(int num, char ch) {
        for (int i = 1; i <= num - 1; i++) {
            System.out.print(ch);
            for (int j = 1; j <= num - 4; j++) {
                System.out.print(" ");
            }
            System.out.println(ch);
        }

        for (int fdas = 1; fdas <= num - 2; fdas++) {
            System.out.print(ch);
        }
    }
}