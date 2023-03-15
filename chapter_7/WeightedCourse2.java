
public class WeightedCourse2 extends Course {
	
	private double weight;
	
	public WeightedCourse2(String c, double g) {
		
		super(c, g);
		weight = 1.2;
		
	}
	
	public double getWeightedGrade() {
		
		return  super.getGrade() * weight;
		
	}
	
	public String toString() {

		return super.toString() + "\nWeighted Grade: " + getWeightedGrade();
		
	}
	
}
