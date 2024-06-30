import java.util.*;
public class arraythree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                isAscending = false;

            }
            if(isAscending){
                System.out.println("Sorted");
            }else{
                System.out.println("not sorted");
            }
        }
        sc.close();
    }
    
}
