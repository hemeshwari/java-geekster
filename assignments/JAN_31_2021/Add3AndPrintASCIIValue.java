package JAN_31_2021;

import java.util.Scanner;

public class Add3AndPrintASCIIValue {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");  
        Scanner scan = new Scanner(System.in);  
        char ch = scan.next().charAt(0);  
        
        int ch1 = (char)ch+3;
        
        char asciiValue1 = (char)ch1;
        
        System.out.println("you entered "+ch+" your new value is "+asciiValue1);
        scan.close();  
    }
}
