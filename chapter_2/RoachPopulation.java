
public class RoachPopulation {

	private double size;
	
	public RoachPopulation() {
		size = 0.0;
	}
	
	public RoachPopulation(double s) {
		size = s;
	}
	
	public double getRoaches() {
		return size;
	}
	
	public void waitForIt() {
		size = size * 2;
	}
	
	public void spray() {
		size = size - size / 10;
	}
	
}
