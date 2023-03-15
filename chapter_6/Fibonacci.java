import java.util.Scanner;

public class Fibonacci {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("How many fib numbers? ");
		int nums = s.nextInt();
		int a=1;
		int b=1;
		int c=1;
		System.out.print(a+"\t"+b+"\t");
		for(int i=0; i< nums-2; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
		}
	}
}
