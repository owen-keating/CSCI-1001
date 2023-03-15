import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("Words2.txt"));
		String [] wordList = new String [125];
		
		for(int i = 0; i < wordList.length; i++) {
			
			if(scan.hasNext())
				wordList[i]=scan.next().toLowerCase();
			
		}
		
		scan.close(); 
		
		Scanner s = new Scanner(System.in);
		  
		System.out.println("********************Welcome to Hangman********************");
		  
		System.out.println("Here's your mystery word: ");
		int wordIndex = (int)(Math.random() * 126);
		String word = wordList[wordIndex];
		
		for(int i = 0;i < word.length();i++) {
			System.out.print("_ ");
		}
		  
		String [] correctLetters = new String[word.length()];
		
		for(int i = 0;i < word.length();i++) {
			correctLetters[i] = "_ ";
		}
		
		String [] wrongLetters = new String[6];	  
		
		for(int i = 0;i < 6;i++) {
			 wrongLetters[i] = "";
		}
		
		int count1 = 0;
		
		while(count1 < 6) {
			
			int count2 = 0;
			System.out.println("\n");
			System.out.println("Guess a letter: ");
			String letter = s.nextLine();
			boolean repeat = false;
			
			for(int i = 0;i < wrongLetters.length;i++) {
				
				if(letter.equals(wrongLetters[i])) {
					System.out.print("You already guessed that letter!");
					repeat = true;
					break;
				}
				
			}
			
			if(repeat)
				continue;
			  
			for(int i = 0;i < word.length();i++) {
				
				if(letter.equals(word.substring(i, i+1)))
					correctLetters[i] = letter + " ";
				else 
					count2++;
			}
			  		  
			if(count2 == word.length()) {
				wrongLetters[count1] = letter;
				System.out.print("Wrong letters guessed: ");
				
				for(int i = 0;i < wrongLetters.length;i++) {
					System.out.print(wrongLetters[i] + " ");
				}
					  
				System.out.println("\n");
				count1++;
				if(count1 == 1)
					System.out.print("+----+\n" + "|    O\n" + "|\n" + "|\n" + "|__________");
				else if(count1 == 2)
					System.out.print("+----+\n" + "|    O\n" + "|    |\n" + "|\n" + "|__________");
				else if(count1 == 3)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\n" + "|\n" + "|__________");
				else if(count1 == 4)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\\\n" + "|\n" + "|__________");
				else if(count1 == 5)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\\\n" + "|   /\n" + "|__________");
				else if(count1 == 6) {
					System.out.println("+----+\n" + "|    O\n" + "|   /|\\\n" + "|   / \\ \n" + "|__________");
					System.out.println("");
					System.out.println("Game over!");
					System.out.println("");
					System.out.println("The correct word was '" + word + "'");
				}
				  
				if(count1 != 6) {
					System.out.println("\n");
					
					for(int i = 0;i < word.length();i++) {
						System.out.print(correctLetters[i]);
					}
					
				}
				
			}
			
			else {
				  
				System.out.print("Wrong letters guessed: ");
				
				for(int i = 0;i < wrongLetters.length;i++) {
					
					System.out.print(wrongLetters[i] + " ");
				}
					  
				System.out.println("\n");
				if(count1 == 0)
					System.out.print("+----+\n" + "|\n" + "|\n" + "|\n" + "|__________");
				else if(count1 == 1)
					System.out.print("+----+\n" + "|    O\n" + "|\n" + "|\n" + "|__________");
				else if(count1 == 2)
					System.out.print("+----+\n" + "|    O\n" + "|    |\n" + "|\n" + "|__________");
				else if(count1 == 3)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\n" + "|\n" + "|__________");
				else if(count1 == 4)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\\\n" + "|\n" + "|__________");
				else if(count1 == 5)
					System.out.print("+----+\n" + "|    O\n" + "|   /|\\\n" + "|   /\n" + "|__________");
				System.out.println("\n");
				
				for(int i = 0;i < word.length();i++) {
					
					System.out.print(correctLetters[i]);
				}
					  
				int count3 = 0;
				  
				for(int i = 0;i < word.length();i++) {
					  
					if(correctLetters[i].substring(0,1).equals(word.substring(i, i+1)))
					count3++;
					
				}
				  
				if(count3 == word.length()) {
					System.out.println("\n");
					System.out.print("You got it!");
					break;
				}
			}
		} 	  
	}
}  
