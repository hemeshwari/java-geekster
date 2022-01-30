package assignments.JAN_25_2021;

import java.util.Scanner;

public class CheckPrimeNumberOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number to check : ");
        int number = scan.nextInt();
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        scan.close();
    }
}