package JAN_31_2022;

import java.util.Scanner;

public class ConvertCityNameIntoReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String string = scan.nextLine();
        String reverseString = "";
        char ch;
        
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i); 
            reverseString = ch + reverseString; 
        }
        System.out.println("Reversed word: " + reverseString);

        scan.close();
    }

}
