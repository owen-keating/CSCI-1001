import java.util.Scanner;

public class Sent {

	public static void main(String[]args) {
		
		int sum = 0;
		int count = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a value, -99 to stop  ");
		int n = s.nextInt();
		
		while(n != -99) {
			
			if(n>0&&n<100) {
				sum += n;
				count ++;
			}
		
			System.out.print("Enter a value, -99 to stop  ");
			n = s.nextInt();			
		
		}
		
		System.out.println("Avg is " + (double)sum/count);
		
	}
	
}
