package FEB_09_2022;

import java.util.Scanner;

public class UserInputPositiveNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("###################################");
        System.out.println("");

        userInputPositiveNumbers(array);
        sc.close();
        
    }
    
    public static void userInputPositiveNumbers(int[] array) {
        

        for (int i = 0; i < array.length; i++) {
            if (!(array[i]<0)) {
                System.out.println(array[i]);
            }

        }

        
        
    }
}
