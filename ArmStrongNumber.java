public class ArmStrongNumber {
    public static void main(String args[]) {
      
      int i=100;
      int arm,n;
      while(i<1000){
          n = i;
          arm = 0;
          while(n>0){
              int rem = n%10;
              arm = arm + (rem*rem*rem);
              n = n/10;
          }
          if(arm == i) {
              System.out.println(i);
          }
          i++;
      }
        
    }
}
