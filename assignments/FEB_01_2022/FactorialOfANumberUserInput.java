package FEB_01_2022;

import java.util.Scanner;

public class FactorialOfANumberUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = scan.nextInt();

        factorial(n);

        scan.close();
    }

    static void factorial(int n) {
        Scanner scan1 = new Scanner(System.in);

        int i = n, fact = 1;
        if (n == 0) {
            System.out.println("the factorial of " + n + " is -> 0");
        } else {

            while (n / i != n) {
                fact = fact * i;
                i--;
            }
            System.out.println("the factorial of " + n + " is -> " + fact);
            
            System.out.println("do you want to continue y/n ");
            char c = scan1.next().charAt(0);
            if(c=='y') {
            	System.out.println("enter number : ");
                int n1 = scan1.nextInt();

                factorial(n1);
            }else if(c=='n'){
            	System.out.println("you entered no....");
            }else {
            	System.out.println("you entered wrong input....");
            }
        }
        scan1.close();

    }
}
