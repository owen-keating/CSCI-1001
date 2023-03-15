import java.util.Scanner;

public class SavingsTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Initial Deposit? ");
		SavingsAccount s2 = new SavingsAccount(s.nextDouble());
		System.out.println("Balance before withdrawal: $" + s2.getBalance());
		
		System.out.print("Enter deposit amount? ");
		s2.deposit(s.nextDouble());
		System.out.println("After deposit balance: $" + s2.getBalance());
		
		System.out.print("Enter withdrawal amount? ");
		s2.withdrawal(s.nextDouble());
		System.out.println("Final balance: $" + s2.getBalance());
		
		s2.interest();
		System.out.print("After adding interest: " + s2.getBalance());
		
	}
}
