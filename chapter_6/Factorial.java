import java.util.Scanner;

public class Factorial {
	
	public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int x = s.nextInt();
	int i;
	int y = 1;
	String a = "";
	
	for(i = x; i >= 1; i--) {
		y *= i;
	
		if(i > 1) {
			a += i + " * ";
		}
		
		else {
			a += i;
		}
	
	}
	
	System.out.print(x + "! = " + a + " = " + y);
	
	}

}
