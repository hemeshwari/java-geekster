package assignments.JAN_24_2021;

public class ForAndWhileLoopexampleToPrint_10_8_6_4_2 {
    public static void main(String[] args) {
        int i=10;
        while(i>0){
            if(i%2==0)
                System.out.println(i);

            i--;
        }
        
        System.out.println("#######################################3");

        for (int j = 10; j > 0; j--) {
            if (j%2==0)
            System.out.println(j);            
        }
    }
}
