package JAN_27_2022;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String arg[]){   
        Scanner scan = new Scanner(System.in);

        System.out.println("enter x1 point");
        int x1 = scan.nextInt();

        System.out.println("enter y1 point");
        int y1 = scan.nextInt();

        System.out.println("enter x2point");
        int x2 = scan.nextInt();

        System.out.println("enter y2 point");
        int y2 = scan.nextInt();

        distance(x1,x2,y1,y2);
        
        scan.close();

    }

    public static void distance(int x1,int x2, int y1, int y2){
        double distance;

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("the distance between" + " ( " + x1 + " , " + y1 + " ) ," + " ( " + x2 + " , " + y2 + " )  = " + distance);

    }

}
