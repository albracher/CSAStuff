
        //Allen Phu CSA 2018. takes in a date and outputs day of the week it occured on by counting the number of days
        //since Jan 1st, 1970
        package Projects;
import java.util.Scanner;

public class DayOfTheWeek2 {
    public static void main(String[] args) {
        //takes in Day, Month, Year
        Scanner console = new Scanner(System.in);
        System.out.println("What is the month? Keep in mind that 1 is January, and 12 is December.");
        int Month = console.nextInt();
        System.out.println("What is the day?");
        int Day = console.nextInt();
        System.out.println("What is the year? ");
        int Year = console.nextInt();
        //find # of years
        int numOfYears = Year - 1970;
        System.out.println("numOfYears = " + numOfYears);
        int numOfDaysfromYears = numOfYears * 365;
        System.out.println("numOfDaysfromYears = " + numOfDaysfromYears);
        // this calculates the number of days in that you are in the month
        //for example if Day = 15, then 14 days have passed since the first of the month
        int numOfDaysfromMonth = Day - 1;
        System.out.println("numOfDaysfromMonth = " + numOfDaysfromMonth);
        //add days from preceding months
        //if it is April 16th, then we already know 15 days have passed since the first day, this is handled by numofDaysfromMonth
        //but we also need to know how many days have passed since the beginning of the year, or January in this case
        int numPassedDays = 0;
        if (Month == 1) {
            numPassedDays = 0;
        } else if (Month == 2) {
            numPassedDays = 31;
        } else if (Month == 3) {
            numPassedDays = 59;
        } else if (Month == 4) {
            numPassedDays = 90;
        } else if (Month == 5) {
            numPassedDays = 120;
        } else if (Month == 6) {
            numPassedDays = 151;
        } else if (Month == 7) {
            numPassedDays = 181;
        } else if (Month == 8) {
            numPassedDays = 212;
        } else if (Month == 9) {
            numPassedDays = 243;
        } else if (Month == 10) {
            numPassedDays = 273;
        } else if (Month == 11) {
            numPassedDays = 304;
        } else if (Month == 12) {
            numPassedDays = 334;
        }
        System.out.println("numPassedDays = " + numPassedDays);
        //we must account for leap years as well!
        //in this case, if the year IS a leap year, then we can add LeapYearNumber to our number of days
        //otherwise, we want to subtract one
        int leapYearNum = (Year - 1972) / 4;
        //in this case, if the year is 1970 or 1971, the leapYearNumber must be 0 otherwise the code will spit out -1
        if (Year == 1970 || Year == 1971) {
            leapYearNum = 0;
            //calculate number of leap years for each year
        } else if (Year >= 1972 && Year <= 1975) {
            leapYearNum = 1;
        } else if (Year >= 1976 && Year <= 1979) {
            leapYearNum = 2;
        } else if (Year >= 1980 && Year <= 1983) {
            leapYearNum = 3;
        } else if (Year >= 1984 && Year <= 1987) {
            leapYearNum = 4;
        } else if (Year >= 1988 && Year <= 1991) {
            leapYearNum = 5;
        } else if (Year >= 1992 && Year <= 1995) {
            leapYearNum = 6;
        } else if (Year >= 1996 && Year <= 1999) {
            leapYearNum = 7;
        } else if (Year >= 2000 && Year <= 2003) {
            leapYearNum = 8;
        } else if (Year >= 2004 && Year <= 2007) {
            leapYearNum = 9;
        } else if (Year >= 2008 && Year <= 2011) {
            leapYearNum = 10;
        } else if (Year >= 2012 && Year <= 2015) {
            leapYearNum = 11;
        } else if (Year >= 2016 && Year <= 2019) {
            leapYearNum = 12;
        } else if (Year >= 2020 && Year <= 2023) {
            leapYearNum = 13;
        } else if (Year >= 2024 && Year <= 2027) {
            leapYearNum = 14;
        } else if (Year >= 2028 && Year <= 2029) {
            leapYearNum = 15;
        } else {
            leapYearNum = leapYearNum;
        }
        System.out.println("leapYearNum = " + leapYearNum);
        //finalCalcNumber is the amount of days since 1/1/1970
        int finalCalcNumber = numOfDaysfromMonth + numOfDaysfromYears + leapYearNum + numPassedDays;
        System.out.println(finalCalcNumber);
        int numCalc = finalCalcNumber % 7;

        //finally, the day is calculated. Day Zero = thursday.
        if (numCalc == 0) {
            System.out.println("Thursday");
        } else if (numCalc == 1) {
            System.out.println("Friday");
        } else if (numCalc == 2) {
            System.out.println("Saturday");
        } else if (numCalc == 3) {
            System.out.println("Sunday");
        } else if (numCalc == 4) {
            System.out.println("Monday");
        } else if (numCalc == 5) {
            System.out.println("Tuesday");
        } else if (numCalc == 6) {
            System.out.println("Wednesday");
        }
    }

}

