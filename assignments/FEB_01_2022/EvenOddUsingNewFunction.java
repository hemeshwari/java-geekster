package FEB_01_2022;

import java.util.Scanner;

public class EvenOddUsingNewFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        check(num);

        scan.close();
    }

    public static void check(int num) {

        Scanner scan1 = new Scanner(System.in);

        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        System.out.println("do you want to continue y/n ");
        char c = scan1.next().charAt(0);
        if (c == 'y') {
            System.out.println("enter number : ");
            int n1 = scan1.nextInt();

            check(n1);
        } else if (c == 'n') {
            System.out.println("you entered no....");
        } else {
            System.out.println("you entered wrong input....");
        }

        scan1.close();
    }
}
