import java.util.*;

public class RunCourse {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		List<String>courses = new ArrayList();
		List<Double>grades = new ArrayList();
		
		String check = "";
		String courseEntry = "";
		double grade = 0.0;
		double uwsum = 0.0;
		double wsum = 0.0;
		
		while(!check.equals("n")) {
			
			System.out.println("Enter a course: ");
			courseEntry = s.nextLine();
			System.out.println("Enter a grade: ");
			grade = Double.parseDouble(s.nextLine());
			System.out.println("Do you want to enter another course? Enter 'y' or'n': ");
			check = s.nextLine();
			
			if(courseEntry.substring(0,2).equals("AP")) {
				
				uwsum += grade * 1.2;
				wsum += grade;
				
			}
			
			else {
				
				uwsum += grade;
				wsum += grade;
			}	
			
			courses.add(courseEntry);
			grades.add(grade);		
		}
			
		for(int i = 0;i < courses.size();i++) {
			
			if(courses.get(i).substring(0,2).equals("AP")){
				
				WeightedCourse2 w = new WeightedCourse2(courses.get(i), grades.get(i));
				System.out.print(w);
				System.out.println("" + "\n");
			
			}
				
			else {
					
				Course uw = new Course(courses.get(i), grades.get(i));
				System.out.print(uw);
				System.out.println("" + "\n");
			
			}
		
		}
			
		System.out.println("Unweighted Average: " + (uwsum/grades.size()));
		System.out.println("Weighted Average: " + (wsum/grades.size()));		
		
	}

}
