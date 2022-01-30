package assignments.JAN_27_2021;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("enter number: ");
        int number = scan.nextInt();
        
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        scan.close();
    }

}
