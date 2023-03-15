
public class War {

	public static void main(String[]args) {

		int[]player1 = new int[26];
		int[]player2 = new int[26];

		for(int i = 0; i < player1.length;i++) {

			player1[i] = (int)((Math.random()*13)+2);

		}

		for(int i = 0; i < player2.length;i++) {

			player2[i] = (int)((Math.random()*13)+2);

		}

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for(int i = 0; i < 26;i++) {
			
			if(player1[i] > player2[i]) {

				if(player1[i] == 11)

					System.out.print("J vs. ");

				else if(player1[i] == 12)

					System.out.print("Q vs. ");

				else if(player1[i] == 13)

					System.out.print("K vs. ");

				else if(player1[i] == 14)

					System.out.print("A vs. ");

				else

					System.out.print(player1[i] + " vs. ");

				if(player2[i] == 11)

					System.out.println("J");

				else if(player2[i] == 12)

					System.out.println("Q");

				else if(player2[i] == 13)

					System.out.println("K");

				else if(player2[i] == 14)

					System.out.println("A");

				else

					System.out.println(player2[i]);

				count1++;

				System.out.println("Player 1 wins!");

			}

			else if(player1[i] < player2[i]) {

				if(player1[i] == 11)

					System.out.print("J vs. ");

				else if(player1[i] == 12)

					System.out.print("Q vs. ");

				else if(player1[i] == 13)

					System.out.print("K vs. ");

				else if(player1[i] == 14)

					System.out.print("A vs. ");

				else

					System.out.print(player1[i] + " vs. ");

				if(player2[i] == 11)

					System.out.println("J");

				else if(player2[i] == 12)

					System.out.println("Q");

				else if(player2[i] == 13)

					System.out.println("K");

				else if(player2[i] == 14)

					System.out.println("A");

				else

					System.out.println(player2[i]);

				count2++;

				System.out.println("Player 2 wins!");

			}

			else {

				if(player1[i] == 11)

					System.out.print("J vs. ");

				if(player1[i] == 12)

					System.out.print("Q vs. ");

				if(player1[i] == 13)

					System.out.print("K vs. ");

				if(player1[i] == 14)

					System.out.print("A vs. ");

				else

					System.out.print(player1[i] + " vs. ");

				if(player2[i] == 11)

					System.out.println("J");

				if(player2[i] == 12)

					System.out.println("Q");

				if(player2[i] == 13)

					System.out.println("K");

				if(player2[i] == 14)

					System.out.println("A");

				else

					System.out.println(player2[i]);

				count3++;

				System.out.println("It's a tie!");

			}
			
			System.out.println("Player 1 wins: " + count1);

			System.out.println("Player 2 wins: " + count2);

			System.out.println("Amount of ties: " + count3);

			System.out.println("");

		}

	}

}
