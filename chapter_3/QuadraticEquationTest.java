import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Value of a? ");
		int a = s.nextInt();
		System.out.print("Value of b? ");
		int b = s.nextInt();
		System.out.print("Value of c? ");
		int c = s.nextInt();
		QuadraticEquation f = new QuadraticEquation(a,b,c);
		System.out.println("roots: " + f.getSolution1(a,b,c) + " , " + f.getSolution2(a,b,c));

	}
}
