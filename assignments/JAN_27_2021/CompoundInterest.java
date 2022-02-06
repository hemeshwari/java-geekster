package JAN_27_2021;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter principle:  ");
        double principle = scan.nextDouble();

        System.out.println("Enter rate:  ");
        double rate = scan.nextDouble();

        System.out.println("Enter time:  ");
        double time = scan.nextDouble();

        compoundInterest(principle, rate, time);
        scan.close();

    }

    public static void compoundInterest(double principle, double rate, double time) {
        double CI = principle * (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is " + CI);
    }
}
