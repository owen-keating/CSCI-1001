import java.util.Scanner;

public class CircleTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Radius? ");
		double x = s.nextDouble();
		Circle c = new Circle(x);
		System.out.println("Area: " + c.getArea(x));
		System.out.println("Perimeter: " + c.getPerimeter(x));
	}
}
