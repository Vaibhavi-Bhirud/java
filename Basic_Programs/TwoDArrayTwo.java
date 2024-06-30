import java.util.*;
public class TwoDArrayTwo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();


        int Array[][]=new int[rows][colms];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                Array[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
         for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                if(Array[i][j]==x){
                    System.out.println("Array element "+x+" found at index ("+i+","+j+")");
                }
               
            }
          
        }
        sc.close();
    }
}
