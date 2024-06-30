import java.util.*;
public class SumOddNum {
    public static int PrintOddNumSum(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                count = count+i;
            }
        }
        return count ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = PrintOddNumSum(n);
        sc.close();

        System.out.println(sum);
    }
}
