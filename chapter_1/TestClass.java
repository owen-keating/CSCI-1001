import java.util.Scanner;

public class TestClass {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Name? ");
		String x = s.nextLine();
		int y = x.length() - 1;
		for (int i = y; i >= 0; i--) {
			System.out.print(x.charAt(y));
			y--;
		}
	}
}
