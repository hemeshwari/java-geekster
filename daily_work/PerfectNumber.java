package daily_work;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            
            if(n%i==0){
                sum = sum+i; 
            }
        }
        if(sum==n){
            System.out.println(n+" is perfect number");
        }else{
            System.out.println(n+" is not perfect number");
        }
        scanner.close();
    }
}
