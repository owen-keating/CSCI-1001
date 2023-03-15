import java.util.Scanner;

public class LastnameFirstname {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name? ");
		String n = s.nextLine();
		int x = n.indexOf(" ");
		System.out.println(n.substring(x+1) + ", " + n.substring(0,x));
		
	}
}
