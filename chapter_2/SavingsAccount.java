
public class SavingsAccount {

// instance fields
	
	private double balance;
	private double interest;
	
// default constructor
	
	public SavingsAccount() {
		balance = 0.0;
	}
	
// parameter instructor
	
	public SavingsAccount(double b) {
		balance = b;
		interest = 0.06;
	}
	
// accessor methods
	
	public double getBalance() {
		return balance;
	}
	
// modifier methods
	
	public void deposit(double cash) {
		balance = balance+cash;
	}
	
	public void withdrawal(double cash) {
		balance = balance-cash;
	}
	
	public void interest() {
		balance = balance*(1+interest);
	}
	
}
