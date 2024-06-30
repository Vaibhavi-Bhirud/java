import java.util.*;
public class Greater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        System.out.println(GreaterNum(n1,n2));

    }
    public static int GreaterNum(int n1,int n2){
      //int greater;
        if(n1>n2)
        return n1;   
        // greater = n1;
        else
        return n2; 
            //greater = n2; 
            
   // return greater;
 }   
}
