import java.util.*;
public class TwoDarrayOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();

        int Num[][] = new int[rows][colms];

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                Num[i][j]=sc.nextInt();
            }
            System.out.println();
        }

         for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
               System.out.print(Num[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
