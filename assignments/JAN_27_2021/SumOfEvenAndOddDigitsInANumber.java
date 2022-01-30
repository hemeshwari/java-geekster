package assignments.JAN_27_2021;

import java.util.Scanner;

public class SumOfEvenAndOddDigitsInANumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("enter number: ");
        int number = scan.nextInt();
        
        int odd = 0;
        int even = 0;
        while (number > 0)
        {
            if ((number % 10) % 2 == 0)
            odd = odd + number % 10;
            else
            even = even + number % 10;
            number = number / 10;
        }
        System.out.print("even : " + odd + " odd : " + even);

        scan.close();
    }

}
