package JAN_28_2021;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int input = scan.nextInt();

        printTriagle(input);

        scan.close();
    }

    public static void printTriagle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
