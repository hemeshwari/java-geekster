package JAN_31_2022;

import java.util.Scanner;

public class ConvertTemperatureFromFahrenheitToCelsiusDegree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value in fahrenheit to calculate celsius : ");
        float fahrenheit = scan.nextFloat();
        
        float celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in celsius is: " + celsius);

        scan.close();
    }
}
