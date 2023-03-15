import java.util.Scanner;

public class RandomWalk {
	
	public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("How many spaces would you like to move? Enter here: ");
	int x = s.nextInt();
	String a = "                                        x                                        ";	

	do {
		int y = (int)(Math.random() * 2) + 1;
		x--;
	
		if(y == 1) {
			a = " " + a;
		}
		
		else {
			a = a.substring(1);
		}
	
		System.out.println(a);
	
	} while(x != 0);
	
	}

}
