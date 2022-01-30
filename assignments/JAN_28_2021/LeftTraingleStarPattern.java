package assignments.JAN_28_2021;

import java.util.Scanner;

public class LeftTraingleStarPattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int input = scan.nextInt();

        leftTraingleStarPattern(input);

        scan.close();
    }

    public static void leftTraingleStarPattern(int k) {
        int a, b;

        for (a = 0; a < k; a++) {

            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
