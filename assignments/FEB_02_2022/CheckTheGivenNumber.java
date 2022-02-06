package FEB_02_2022;

import java.util.Scanner;

public class CheckTheGivenNumber {
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		String result;
		
		result = n==10 || n== 20 || n==30 || n==40 || n==50 ? "Number is present "+n:"Number is not present "+n;
		System.out.println(result);

        sc.close();
	}
}
