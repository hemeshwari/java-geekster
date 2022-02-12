package JAN_31_2022;

import java.util.Scanner;

public class ConvertMinutesIntoANumberOfYearsAndDays {
    public static void main(String[] Strings) {
        double minutesInYear = 60 * 24 * 365;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter minutes: ");

        double min = scan.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is " + years + " years and " + days + " days");

        scan.close();
    }
}
