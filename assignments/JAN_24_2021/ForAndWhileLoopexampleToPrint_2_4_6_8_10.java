package JAN_24_2021;

public class ForAndWhileLoopexampleToPrint_2_4_6_8_10 {
    public static void main(String[] args) {
        int i=1;

        while(i<=10){
            if(i%2==0)
                System.out.println(i);

            i++;
        }
        
        System.out.println("#######################################3");

        for (int j = 1; j <= 10; j++) {
            if (j%2==0)
            System.out.println(j);            
        }
    }
}
