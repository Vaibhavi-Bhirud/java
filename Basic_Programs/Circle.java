import java.util.*;
public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.close();
        System.out.println(CircumferenceOfCircle(radius));

    }

    public static double CircumferenceOfCircle(double radius){
        double circum = 2*(3.14*radius);

        return circum;

    }
    
}
