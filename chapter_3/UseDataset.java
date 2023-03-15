import java.util.Scanner;

public class UseDataset {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		Dataset d = new Dataset();
		
		System.out.print("Enter an int: ");
		int x = s.nextInt();
		d.addValue(x);
		
		System.out.print("Enter an int: ");
		x = s.nextInt();
		d.addValue(x);
		
		System.out.print("Enter an int: ");
		x = s.nextInt();
		d.addValue(x);
		
		System.out.print("Enter an int: ");
		x = s.nextInt();
		d.addValue(x);
		
		System.out.println("The largest number in the set is: " + d.getSmallest());
		System.out.println("The smallest number in the set is: " + d.getLargest());
		
	}
}
