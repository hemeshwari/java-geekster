package JAN_31_2022;

import java.util.Scanner;

public class ConvertInchesToMeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value in inches to calculate meters : ");
        double inches  = scan.nextDouble();
        double meters = inches*0.0254;

        System.out.println("your value in inches is : "+inches+"  your value in meters is : "+ meters);
        scan.close();
    }
}
