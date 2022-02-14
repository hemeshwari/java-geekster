package FEB_09_2022;

import java.util.Scanner;

class UserInputSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        userInputSum(array);
        sc.close();
        
    }
    
    public static int userInputSum(int[] array) {
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];

        }

        System.out.println(sum);
        return sum;
    }
}
