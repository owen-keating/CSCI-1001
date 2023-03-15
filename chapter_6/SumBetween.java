import java.util.Scanner;

public class SumBetween {
	
	public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter first value: ");
	int num1 = s.nextInt();
	System.out.print("Enter second value: ");
	int num2 = s.nextInt();
	
	if(num1 > num2) {
		int x;
		for(x = 0; num2 <= num1; num2++) {
			x += num2;
		}
		System.out.print("Sum is " + x + ".");
	
	}
	else {
		int y;
		for(y = 0; num1 <= num2; num1++) {
			y += num1;
		}
		System.out.print("Sum is " + y + ".");
	}

	}

}
