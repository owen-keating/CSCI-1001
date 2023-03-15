import java.util.Scanner;

public class VowelFinder {

	public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a word: ");
	String x = s.nextLine();
	int i = 0;
	String y = "";
	
	for(i = 0; i < x.length(); i++) {
		
		if(x.substring(i, i + 1).equals("a") || x.substring(i, i + 1).equals("e") || x.substring(i, i + 1).equals("i") || x.substring(i, i + 1).equals("o") || x.substring(i, i + 1).equals("u")) {
			y += "x";
		}
		
		else {
			y += x.substring(i, i + 1);
		}
	}
	
	System.out.print(y);
	
	}

}
