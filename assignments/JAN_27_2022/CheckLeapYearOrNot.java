package JAN_27_2022;

import java.util.Scanner;

public class CheckLeapYearOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year to check:  ");
        int input = scan.nextInt();

        checkLeapYearOrNot(input);

        scan.close();
    }

    public static boolean checkLeapYearOrNot(int year) {

        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }else{
                leap = true;
            }                
        }else{
            leap = false;
        }  

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        return leap;
    }
}
