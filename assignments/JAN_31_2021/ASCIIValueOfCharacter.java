package JAN_31_2021;

import java.util.Scanner;

public class ASCIIValueOfCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");  
        Scanner scan = new Scanner(System.in);  
        char ch = scan.next().charAt(0);  
        int asciiValue = ch;  
        System.out.println("ASCII value of " +ch+ " is: "+asciiValue);
        scan.close();  
    }
    
}  

