import java.util.Scanner;

public class Student {

	private String name;
	private double totalScore;
	
	public Student() {
		name = "";
	}
	
	public Student(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public double getScore() {
		return totalScore;
	}
	
	public void addQuiz() {
		Scanner s = new Scanner(System.in);
		System.out.print("Student Name: ");
		name = s.nextLine();
		System.out.print("Score 1: ");
		double x = s.nextDouble();
		System.out.print("Score 2: ");
		double y = s.nextDouble();
		System.out.print("Score 3: ");
		double z = s.nextDouble();
		totalScore = x + y + z;
		System.out.print(name + " had a total score of " + totalScore);
	}
	
	public double getAverageScore() {
	
		return totalScore / 3;
		
	}

}
