import java.util.Scanner;

public class Student2 {

	public static void main(String[]args) {
			
		Scanner s = new Scanner(System.in);
			
		System.out.print("Name? ");
		String name = s.nextLine();
			
		double avg = 0.0;
		int count = 0;
		System.out.print("Would you like to enter more test scores? ");			
		String b = s.nextLine();
		int total = 0;
		int highest = 0;
		
		while(!b.equals("No")) {
			
			count++;
			System.out.print("Enter a quiz score here: ");
			int x = s.nextInt();
			s.nextLine();
			total += x;
			avg = (double)total/count;
			
			if(x > highest) {
				highest = x;
			}
			
			System.out.print("Would you like to enter more test scores? ");	
			b = s.nextLine();
			
		}
			
			String avgscore;
			
			if(avg >= 90) {
				avgscore = "n A.";
			}
			
			else if(avg <= 89 && avg >= 80) {
				avgscore = " B.";
			}
			else if(avg <= 79 && avg >= 70) {
				avgscore = " C.";
			}
			else if(avg <= 69 && avg >= 60) {
				avgscore = " D.";
			}
			else {
				avgscore = "n F.";
			}
			
			System.out.print(name + " had a total score of " + total + ", a highest score of " + highest + ", and an average score of " + avg + ", a" + avgscore);
			
	}

}
