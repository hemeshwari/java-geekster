package daily_work;

import java.util.Scanner;

public class CalculatePerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float perimeter = a+b+c;
        System.out.println("perimeter of triangle is ="+perimeter);

        scan.close();
    }
}
