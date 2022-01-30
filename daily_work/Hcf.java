package daily_work;

import java.util.Scanner;


public class Hcf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        while(n1%n2!=0){
            int reminder = n1%n2;

            n1=n2;
            n2=reminder;
        }
        int hcf = n2;
        System.out.println(hcf);

        scan.close();
    }
}
