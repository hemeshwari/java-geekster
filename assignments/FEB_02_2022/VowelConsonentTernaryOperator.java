package FEB_02_2022;

import java.util.Scanner;

public class VowelConsonentTernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter charcter from a to z or from A to Z");
        char n = sc.next().charAt(0);
        String result;
        result = n == 'a' ? "vowel"
                : (n == 'A' ? "vowel"
                        : (n == 'e' ? "vowel"
                                : (n == 'E' ? "vowel"
                                        : (n == 'i' ? "vowel"
                                                : (n == 'I' ? "vowel"
                                                        : (n == 'o' ? "vowel"
                                                                : (n == 'O' ? "vowel"
                                                                        : (n == 'u' ? "vowel"
                                                                                : (n == 'U' ? "vowel"
                                                                                        : "Consonant")))))))));
        System.out.println(result);

        sc.close();
    }
}
