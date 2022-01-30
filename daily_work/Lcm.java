import java.util.Scanner;

public class Lcm{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int originlValue1 = n1;
        int originlValue2 = n2;
        while(n1%n2!=0){
            int reminder = n1%n2;

            n1=n2;
            n2=reminder;
        }
        int hcf = n2;
        System.out.println(hcf);

        int lcm = (originlValue1*originlValue2)/hcf;
        System.out.println(lcm);

        scan.close();

    }

}