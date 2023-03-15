import java.util.Scanner;

public class NameTest {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("First name? ");
		String f = s.nextLine();
		System.out.print("Middle name? ");
		String m = s.nextLine();
		System.out.print("Last name? ");
		String l = s.nextLine();
		
		Name n = new Name(f,m,l);
		
		System.out.println(n.getFullName());
		System.out.println(n.getMixedName());
		System.out.println(n.getInitials());
		System.out.println(n.getLength());
				
	}
}
