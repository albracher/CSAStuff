//Allen Phu 2018, this program takes in a day, month, and year, and calculates the day of the week it is according to the given parameters.
package Projects;

import java.util.Scanner;

//use MM/DD/YYYY format
//this uses Key Value Method to calc day of the month
// http://mathforum.org/dr.math/faq/faq.calendar.html
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is the Month? Keep in mind that 1 is January, and 12 is December.");
        int Month = console.nextInt();
        System.out.println("What is the day?");
        int Day = console.nextInt();
        System.out.println("What is the year? ");
        int Year = console.nextInt();
        //Takes in values Month, Day, Year
        //Divides year number by 100 to get last two digits of the year
        int yearNum = (Year % 100);
        // divide the above value by four w/o a remainder, then add the day of the month
        int keyValueCalc = (yearNum / 4) + Day;
        //Now that we have this value, we need to add a month's key value, dependent on a table
        //for example, if the month is January, add 1 to the value
        //if the month is December, then we must add 6 to the value
        if (Month == 1 || Month == 10) {
            keyValueCalc += 1;
        } else if (Month == 2 || Month == 3 || Month == 11) {
            keyValueCalc += 4;
        } else if (Month == 4 || Month == 7) {
            keyValueCalc += 0;
        } else if (Month == 6) {
            keyValueCalc += 5;
        } else if (Month == 8) {
            keyValueCalc += 3;
        } else if (Month == 5) {
            keyValueCalc += 2;
        } else if (Month == 12 || Month == 9) {
            keyValueCalc += 6;
        }
       //now that we have this Post-Key-Value, we need to calculate leap year
        //Leap years occur every four years, so 1970, 1974, 1978, etc.
        //therefore to calc. leap year, divide year by 4, whenever remainder is 2 then it is leap year
        //according to the key value method, if month is January or February of a leap year, then you must subtract 1 from the value
        int newCenturyCodeCalc = keyValueCalc;
        if (Year % 4 == 0 && (Month == 1 || Month == 2)) {
            newCenturyCodeCalc -= 1;
        } else {
            newCenturyCodeCalc += 0;
        }
        //Now that we have determined the leap year limitation, we can add a "century code" for the Gregorian calendar
        //According to the method, if your year is in the 1900s, then you do not need to add anything to your value.
        //However, if your year was in the 2000s, then you must add 6 to the value.
        int newNumAgain = newCenturyCodeCalc;
        if (Year >= 1970 && Year <= 1999){
            newNumAgain += 0;
        } else {
            newNumAgain += 6;
        }
        //We are finally on the final step; now, you must add the above value with the last two digits of the year
        //Last two digits of the year were calculated using the above value, year % 100
        int finalValue = newNumAgain + yearNum;
        int dayNumber = finalValue % 7;
        //now we effectively have the "day number"
        //We divide the "day number" by 7, and the remainder corresponds to the day of the week
        if (dayNumber == 0) {
            System.out.println("Saturday");
        } else if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        }
    }
}




