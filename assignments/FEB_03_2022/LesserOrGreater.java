package FEB_03_2022;

import java.util.Scanner;

public class LesserOrGreater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        boolean con1 = n < 10 && n < 5;
        boolean con2 = n > 10 && n > 5;
        String result;

        result = con1 ? "number is smaller than 5 and 10"
                : (con2 ? "Number is greater than 5 and 10" : "number is smaller than 10 but greater than 5");
        System.out.println(result);

        sc.close();
    }
}
