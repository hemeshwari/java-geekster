

import java.util.Scanner;

public class PuzzleGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int)(Math.random()*100)+1;
        int limit = 1;
        while (limit<3) {
            int number = scan.nextInt();
            System.out.println(randomNumber);
            if (randomNumber<number) {
                System.out.println("too high");
            } else if (randomNumber>number){
                System.out.println("too low");
            }
            else if (randomNumber==number){
                System.out.println("correct");
            }
            
            limit++;
        }
        
        scan.close();
        
        
    }    
}
