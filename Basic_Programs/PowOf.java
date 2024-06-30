import java.util.*;
public class PowOf {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(Powercal(x,n));

    }
     public static double Powercal(int x,int n){
        double mul = 1;
        for(int i=1;i<=n;i++){
            mul = mul*x;
        }
        return mul;

    }
}
