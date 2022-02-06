package FEB_02_2022;

import java.util.Scanner;

public class NameOfMonth {
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number");
		int n=sc.nextInt();
		String result = null;
        result = n==1 ?"jan":(n==2 ? "feb":(n==3? "mar":(n==4? "april":(n==5?"may":(n==6?"june":(n==7?"july":(n==8 ? "aug":(n==9 ? "Sep":(n==10?"oct":(n==11?"nov":(n==12? "dec":"enter valid number")))))))))));
		System.out.println(result);
		
		sc.close();
	
	}
}
