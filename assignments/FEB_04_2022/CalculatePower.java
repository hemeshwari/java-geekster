package FEB_04_2022;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Write a program to print the power

        System.out.println("enter base number : ");
        int base = s.nextInt();
        System.out.println("enter power: ");
        int power = s.nextInt();

        System.out.println(Math.pow(base, power));

        // Assign values of variables 'a' and 'b' as 55 and 70 respectively and then
        // check if both the conditions 'a < 50' and 'a < b' are true.
        int a = 55;
        int b = 70;

        System.out.println(a < 50 && a < b);

        // Now solve the above question to check if atleast one of the conditions 'a <
        // 50' or 'a < b' is true.

        int a1 = 55;
        int b1 = 70;

        System.out.println(a1 < 50 || a1 < b1);

        // If the marks of Robert in three subjects are 78,45 and 62 respectively (each
        // out of 100 ), write a program to calculate his total marks and percentage marks.

        double sub1 = 78;
        double sub2 = 45;
        double sub3 = 62;
        double totl = (sub1 + sub2 + sub3);
        double totalmks = 300 - totl;
        double perc = (totl / 300) * 100;

        System.out.println("Total marks " + totalmks);
        System.out.println("Total percentage  " + perc);

        /*
         * Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write
         * two programs to swap the values of the two variables.
         * 1 - first program by using a third variable
         * 2 - second program without using any third variable
         * 3 - third program by using unary op.
         */

        // program using third Variable
        int a11 = 6;
        int b11 = 8;
        int temp = 0;

        temp = a11;
        a11 = b11;
        b11 = temp;

        System.out.println(a11 + " " + b11);

        // Program without using third Variable
        int a12 = 6;
        int b12 = 8;
        b12 = b12 - a12;
        a12 = b12 + a12;
        b12 = -(b12 - a12);

        System.out.println(a12 + " " + b12);

        // unary operator

        int a13 = 3;
        int b13 = 4;

        a13 = a13 ^ b13;
        b13 = a13 ^ b13;
        a13 = a13 ^ b13;

        System.out.println(a13 + "  " + b13);

        /*
         * The total number of students in a class are 90 out of which 45 are boys.
         * If 50% of the total students secured grade 'A' out of which 20 are boys,
         * then write a program to calculate the total number of girls getting grade
         * 'A'.
         */

        int Totalstd = 90;
        int boys = 45;
        int girls = 90 - 45;
        int halfc = (boys + girls) / 2;
        System.out.println("50% students count =" + halfc);

        int BoysA = 20;
        int GirlsA = halfc - BoysA;
        System.out.println("number of girls getting grade 'A' = " + GirlsA);

        // Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
        int n, first, second, third, reverse;
        n = 123;
        first = n / 100;
        n = n % 100;

        second = n / 10;
        third = n % 10;

        reverse = third * 100 + second * 10 + first;
        System.out.println("Reverse number :" + reverse);
        // Write a program to check if the two numbers 23 and 45 are equal.

        System.out.println(23 == 45);

        // Write a program to add 8 to the number 2345 and then divide it by 3. Now, the
        // modulus of the quotient is taken with 5 and then multiply the resultant value
        // by 5. Display the final result.

        System.out.println((((8 + 2345) / 3) % 5) * 5);

        // Now, solve the above question using assignment operators (eg. +=, -=, *=).

        System.out.println((((8 + 2345) / 3) % 5) * 5);

        int add = 8 + 2345;
        int div = add / 3;
        int mod = div % 5;
        int mul = mod * 5;
        System.out.println(mul);

        // Write a program to calculate the perimeter of a triangle having sides of
        // length 2,3 and 5 units.
        double x = 11;
        double y = 12;
        double unit = 13;

        double perimeter = x + y + unit;
        double ss = perimeter / 2;
        double area = Math.sqrt(ss * (ss - x) * (ss - y) * (ss - unit));

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        // Length and breadth of a rectangle are 5 and 7 respectively. Write a program
        // to calculate the area and perimeter of the rectangle.

        int xx = 5;
        int yy = 7;
        System.out.println("Area is :" + xx * yy);
        System.out.println("Permutation is : " + 2 * (xx * yy));

        s.close();
    }
}
