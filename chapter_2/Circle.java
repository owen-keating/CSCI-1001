
public class Circle {

	private double radius;
	
	public Circle() {
		radius = 0.0;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getArea(double r) {
		double area = 0.0;
		area = 3.14 * r * r;
		return area;
	}
	
	public double getPerimeter(double r) {
		double perimeter = 0.0;
		perimeter = 6.28 * r;
		return perimeter;
	}
		
	public double getRadius() {
		return radius;
	}
}
