import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(FibonacciSeries(n));
    }
    public static int FibonacciSeries(int n){
        int a=0;
        int b=1;
        if(n>1)
       for(int i=2;i<=n;i++){
       System.out.print(a+" ");
        int temp = b;
        b = a+b;
        a = temp;
       }
       
       return a;
    }
}
