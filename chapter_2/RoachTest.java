import java.util.Scanner;

public class RoachTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Initial Population? ");
		double x = s.nextDouble();
		RoachPopulation s1 = new RoachPopulation(x);
		s1.waitForIt();
		s1.spray();
		System.out.println("1st Population: " + s1.getRoaches());
		s1.waitForIt();
		s1.spray();
		System.out.println("2nd Population: " + s1.getRoaches());
		s1.waitForIt();
		s1.spray();
		System.out.println("Final Population: " + s1.getRoaches());
		
	}
}
