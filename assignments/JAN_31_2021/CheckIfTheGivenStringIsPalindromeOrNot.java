package JAN_31_2021;

import java.util.Scanner;

public class CheckIfTheGivenStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();
        boolean flag = true;

        string = string.toLowerCase();

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not a palindrome");
        }
        
        scan.close();
    }
}
