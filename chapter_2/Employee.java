
public class Employee {

	private String name;
	private double salary;
	
	public Employee() {
		name = "";
		salary = 0.0;
	}	
		
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raise(double s) {
		salary = salary + salary*(s/100);
	}
	
}
