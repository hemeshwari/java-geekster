package FEB_01_2022;

import java.util.Scanner;

public class ProgramToCountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        int count = 0;

        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
        scan.close();
    }

}
