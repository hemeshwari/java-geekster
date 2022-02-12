package JAN_26_2022;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = scan.nextInt();

        factorial(n);

        scan.close();
    }

    static void factorial(int n) {
        int i = n, fact = 1;
        if (n == 0) {
            System.out.println("the factorial of " + n + " is -> 0");
        } else {

            while (n / i != n) {
                fact = fact * i;
                i--;
            }
            System.out.println("the factorial of " + n + " is -> " + fact);

        }

    }
}
