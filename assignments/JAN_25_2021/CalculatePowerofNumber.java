package assignments.JAN_25_2021;

import java.util.Scanner;

public class CalculatePowerofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter base : ");
        int base = scan.nextInt();

        System.out.println("enter power: ");
        int exponent = scan.nextInt();

        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("ans = " + result);
        scan.close();
    }

}
