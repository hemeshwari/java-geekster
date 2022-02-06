package JAN_31_2021;

import java.util.Scanner;

public class PrintProductOfDecimalAndIntegerNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double product = a*b;

        System.out.println("your first no. is : "+a+" your second no. is : "+b+" your product no. is : "+product);
        scan.close();
    }
}
