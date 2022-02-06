package JAN_26_2021;

import java.util.Scanner;

public class SumOfNumbersTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number from 1 to .... : ");
        int number = scan.nextInt();
        int i = 1, sum = 0;
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of Numbers from 1 to "+number+ " is = " + sum);
        scan.close();
    }
}
