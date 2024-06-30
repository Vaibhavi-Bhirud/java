import java.util.*;
class AvgFun{

      public static int PrintAvg(int n1,int n2,int n3){
        int avg = (n1+n2+n3)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int avg = PrintAvg(n1, n2, n3);
        in.close();

        System.out.println(avg);
        
    }
   
}