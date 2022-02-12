import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
        float pi =(float) Math.PI;
        float perimeter = 2*pi*r;
        float area = (pi)*r*r;
        float Diameter = 2*r;
        System.out.println("the perimeter of circle is ="+perimeter);
        
        System.out.println("the area of circle is ="+area);

        System.out.println("the Diameter of circle is ="+Diameter);

        scan.close();
    }
}
