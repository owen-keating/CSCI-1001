
public class Course {
	
	private String course;
	private double grade;
	
	public Course(String c, double g) {
		
		course = c;
		grade = g;
		
	}
	
	public double getGrade() {
		
		return grade;
		
	}
	
	public String toString() {
		
		return "Course: " + course + "\nGrade: " + grade;
		
	}
	
}
