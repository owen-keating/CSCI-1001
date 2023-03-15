
public class QuadraticEquation {
		
	private int first;
	private int second;
	private int third;
		
	public QuadraticEquation(int a, int b, int c) {
		first = a;
		second = b;
		third = c;
	}
			
	public double getSolution1(int a, int b, int c) {
		return (-b + Math.sqrt(Math.pow(b, 2)-4.0*a*c))/(2.0*a);
	}
		
	public double getSolution2(int a, int b, int c) {
		return (-b - Math.sqrt(Math.pow(b, 2)-4.0*a*c))/(2.0*a);
	}
		
}
