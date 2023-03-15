
public class Car {

// instance fields
	
	private String vin;
	private int mpg;
	private double gallonsInTank;
	private double milesDriven;
	
// default constructor
	
	public Car() {
		vin = "";
		mpg = 0;
		gallonsInTank = 0.0;
		milesDriven = 0.0;
	}
	
// parameter instructor
	
	public Car(String v, int m, double g, double d) {
		vin = v;
		mpg = m;
		gallonsInTank = g;
		milesDriven = d;
	}
	
// accessor methods
	
	public double currentGallons() {
		return gallonsInTank;
	}
	
	public String currentVIN() {
		return vin;
	}
	
// modifier methods
	
	public void addGas(double g) {
		gallonsInTank = gallonsInTank + g;
	}
	
	public void drive(double m) {
		milesDriven = milesDriven + m;
		gallonsInTank = gallonsInTank - m / mpg;
	}
	
}
