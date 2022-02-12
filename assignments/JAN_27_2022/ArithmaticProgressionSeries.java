package JAN_27_2022;

import java.util.Scanner;

public class ArithmaticProgressionSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number: ");
        int number = scan.nextInt();

        int count = 0;
        for (int i = 1; count < number; i++) {
            int series = 3 * i + 2;
            if (series % 4 != 0) {
                System.out.print(series + " ");
                count++;
            }

        }

        scan.close();
    }
}
