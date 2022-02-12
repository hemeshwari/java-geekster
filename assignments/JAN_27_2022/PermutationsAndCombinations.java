package JAN_27_2022;

import java.util.Scanner;

public class PermutationsAndCombinations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:  ");
        int n = scan.nextInt();

        System.out.println("Enter r:  ");
        int r = scan.nextInt();

        int comb, per;
        per = factorial(n) / factorial(n-r);
        System.out.println("Permutation: " + per);
        comb = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("Combination: " + comb);

        scan.close();
    }
       
     
    public static int factorial(int n) {
          int fact = 1;
          int i = 1;
          while(i <= n) {
             fact *= i;
             i++;
          }
          return fact;
       }

       
    }
    
