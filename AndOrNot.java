import java.util.Scanner;

public class AndOrNot {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("consonent");
        }

        s.close();
    }
    

}
