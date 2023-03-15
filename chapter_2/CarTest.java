
public class CarTest {

	public static void main(String[]args) {
		Car c1 = new Car("X876UUUUUX",24,0.0,0.0);
		Car c2 = new Car("A983943844X",38,0.0,0.0);
		
		c1.addGas(20.0);
		c2.addGas(20.0);
		c1.drive(100.0);
		c2.drive(100.0);
		
		
		System.out.println("The amount of gas remaining in car 1 is " + c1.currentGallons() + " gallons.");
		System.out.println("The amount of gas remaining in car 2 is " + c2.currentGallons() + " gallons.");
		
	}
}
