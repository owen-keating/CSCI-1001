import java.util.Scanner;

public class Sort3Ints {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an int ");
		int a = s.nextInt();
		System.out.print("Enter an int ");
		int b = s.nextInt();
		System.out.print("Enter an int ");
		int c = s.nextInt();
		
		if(a<b && a<c) {
			
			if(b<c) {
			System.out.println(a + "," + b + "," + c);
			
			}
			
			else {
			System.out.println(a + "," + c + "," + b);
			
			}
		
		}
		
		if(b<a && b<c) {
			
			if(a<c) {
			System.out.println(b + "," + a + "," + c);
			
			}
			
			else {
			System.out.println(b + "," + c + "," + a);
			
			}
		
		}
		
		if(c<a && c<b) {
			
			if(a<b) {
			System.out.println(c + "," + a + "," + b);
			
			}
			
			else {
			System.out.println(c + "," + b + "," + a);
			
			}
		
		}
		
		
	}
}
