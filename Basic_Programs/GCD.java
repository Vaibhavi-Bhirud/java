import java.util.*;
public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println(CalGcd(n1,n2));
    }
    public static int CalGcd(int n1,int n2){
        while(n1!=n2){
            if(n1>n2)
            n1 = n1-n2;
            else
            n2 = n2-n1;
        }
        return n2;
      
    }
}
