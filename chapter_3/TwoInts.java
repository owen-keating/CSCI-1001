import java.util.Scanner;

public class TwoInts {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("First integer? ");
		int x = s.nextInt();
		System.out.print("Second integer? ");
		int y = s.nextInt();
		
		System.out.print(x+y + "  ");
		System.out.print(x-y + "  ");
		System.out.print(x*y + "  ");
		System.out.print((x+y)/2.0 + "  ");
		System.out.print(Math.abs(x-y) + "  ");
		System.out.print(Math.max(x, y) + "  ");
		System.out.print(Math.min(x, y));
	}
}
