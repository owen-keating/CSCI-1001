import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[]args) {
	
	Scanner s = new Scanner(System.in);
	String x = "";
	int xtotal = 0;
	int ytotal = 0;
	
	do {
		System.out.println("Enter rock, paper, or scissors here: ");
		String playerchoice = s.nextLine();
		int ychoice = (int)(Math.random() * 3) + 1;
		String ystringchoice;
		
		if(ychoice == 1) {
			ystringchoice = "rock";
		}
		
		else if(ychoice == 2) {
			ystringchoice = "paper";
		}
		
		else {
			ystringchoice = "scissors";
		}
	
		System.out.println("You chose " + playerchoice + " and the computer chose " + ystringchoice + ".");
		
		if(playerchoice.equals("rock") && ychoice == 1) {
			System.out.println("It's a tie.");
		}
		
		else if(playerchoice.equals("rock") && ychoice == 2) {
			ytotal++;
			System.out.println("You lost.");
		}
		
		else if(playerchoice.equals("rock") && ychoice == 3) {
			xtotal++;
			System.out.println("You won!");
		}
	
		else if(playerchoice.equals("paper") && ychoice == 1) {
			xtotal++;
			System.out.println("You won!");
		}
		
		else if(playerchoice.equals("paper") && ychoice == 2) {
			System.out.println("It's a tie.");
		}
		
		else if(playerchoice.equals("paper") && ychoice == 3) {
			ytotal++;
			System.out.println("You lost.");
		}
		
		else if(playerchoice.equals("scissors") && ychoice == 1) {
			ytotal++;
			System.out.println("You lost.");
		}
		
		else if(playerchoice.equals("scissors") && ychoice == 2) {
			xtotal++;
			System.out.println("You won!");
		}
	
		else if(playerchoice.equals("scissors") && ychoice == 3) {
			System.out.println("It's a tie.");
		}
		
		System.out.println("Would you like to play again?");
		x = s.nextLine();
	} while(!x.equals("No"));
	
	if(xtotal > ytotal) {
		System.out.print("You had a winning record of " + xtotal + " to " + ytotal + ".");
	}
	
	else if(ytotal > xtotal) {
		System.out.print("You had a losing record of " + xtotal + " to " + ytotal + ".");
	}
	
	else {
	System.out.print("You tied with the computer with a record of " + xtotal + " to " + ytotal + ".");

	}
	
	}

}
