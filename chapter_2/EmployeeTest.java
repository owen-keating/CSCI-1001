import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Employee Name? ");
		String x = s.nextLine();
		System.out.println("Current Salary? ");
		double y = s.nextDouble();
		Employee e = new Employee(x,y);
		System.out.println("1st Salary: " + e.getSalary());
		e.raise(10.0);
		System.out.println("2nd Salary: " + e.getSalary());
		e.raise(20.0);
		System.out.println("Final Salary: " + e.getSalary());
		
	}
}
