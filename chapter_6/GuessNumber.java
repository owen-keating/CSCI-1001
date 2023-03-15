import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[]args) {
	
	int num = (int)(Math.random() * 100) + 1;
	int guess;
	
	Scanner s = new Scanner(System.in);
	
	do {
		System.out.println("Enter your guess here: ");
		guess = s.nextInt();
		if(guess < num) {
			System.out.println("Guess higher.");
		}
		if(guess > num) {
			System.out.println("Guess lower.");
		}
	} while(guess != num);
	
	System.out.print("You won! The correct number was " + num + ".");

	}

}
