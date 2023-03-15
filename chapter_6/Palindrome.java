import java.util.Scanner;

public class Palindrome {

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Would you like to start? ");
		String x = s.nextLine();
		
		while(!x.equals("No")) {
		System.out.println("Enter a word here: ");
		String word = s.nextLine();
		int a = -1;
		boolean palindrome = false;
		for(int i = 0; i < word.length();i++) { 
			
			if(word.charAt(i) == word.charAt(word.length() + a)) {
				palindrome = true;
			}
			else {
				System.out.println("Your word is not a palindrome");
				palindrome = false;
				break;
			}
			a--;
		}
		
		if(palindrome) {
		System.out.println("Your word is a palindrome.");
		}
		
		System.out.println("Would you like to enter another word? ");
		x = s.nextLine();
		}
		System.out.println("Ok");

	}

}
