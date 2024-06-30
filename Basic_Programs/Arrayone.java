import java.util.*;
public class Arrayone {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String []names = new String[10];
        System.out.println("Enter the Names:");
        for(int i = 0;i<10;i++){
           names[i] = sc.nextLine();
        }
        for(int i=0;i<10;i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
