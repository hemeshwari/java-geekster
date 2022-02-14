import java.util.Scanner;

class ReverseAnArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int reverse[] = new int[n];

        System.out.println("::Reversed Array::");
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length-i-1];

            System.out.println(reverse[i]);
        }


        sc.close();
    }
}