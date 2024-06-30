import java.util.*;

public class numberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNum = (int) (Math.random()*100);
        int userNum = 0;

       do {
        System.out.println("Enter number for guesing..");
        userNum = sc.nextInt();

        if(userNum > myNum){
            System.out.println("your number is greater");

        }else if (userNum < myNum) {
            System.out.println("your number is smaller");
        }else{
            System.out.println("WOHOO.. you guessed the number");
            break;
        }
        
       } while (userNum > 0);

       System.out.print("the number is:");
       System.out.println(myNum);

    }
}
