package JAN_26_2021;

import java.util.Scanner;

public class TablePrinitngProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        s.close();
    }
}
