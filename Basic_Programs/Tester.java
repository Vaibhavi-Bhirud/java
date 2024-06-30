import java.util.*;
class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++){
		  sum = i+i;
		System.out.print(sum+" ");
		}
		sc.close();
	}
}