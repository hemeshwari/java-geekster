


import java.util.Scanner;


public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();

        int a = scan.nextInt();
        float b = scan.nextFloat();
        
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);


        scan.close();
    }
}