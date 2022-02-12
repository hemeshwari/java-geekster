

import java.util.Scanner;


public class ArmStrongNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int limit =scan.nextInt();
        for (int i = 0; i < limit ; i++) {
            if (isArmStrong(i)) {
                System.out.println(i);
            } 
        }
        scan.close();
    }

    private static boolean isArmStrong(int num){
       int temp = num, digit=0, sum=0;
       while (temp>0) {
           temp=temp/10;
           digit++;
       }
       temp=num;
       while (temp>0) {
           int lastDigit = temp%10;
           sum+=Math.pow(lastDigit,digit);
           temp=temp/10;
       }
        return sum==num?true:false;
    }
    
}
