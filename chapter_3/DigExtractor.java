import java.util.Scanner;

public class DigExtractor {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a five digit number. ");
		int x = s.nextInt();
		
		System.out.print(x%10);
		x = x/10;
		System.out.print(x%10);
		x = x/10;
		System.out.print(x%10);
		x = x/10;
		System.out.print(x%10);
		x = x/10;
		System.out.print(x%10);
		x = x/10;
		
	}
}
