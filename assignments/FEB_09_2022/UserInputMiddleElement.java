package FEB_09_2022;

import java.util.Scanner;

public class UserInputMiddleElement {
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
        userInputMiddleElement(array);
        sc.close();
        
    }
    
    public static void userInputMiddleElement(int[] array) {
        int middleElement=array.length/2;

        for (int i = middleElement-1; i <middleElement ; i++) {
            System.out.print(array[i]); 

        }
    }
}
