
public class Dataset {

	private int big;
	private int small;
	
	public Dataset() {
		big = Integer.MIN_VALUE;
		small = Integer.MAX_VALUE;
	}
	
	public int getLargest() {
		return big;
	}
	
	public int getSmallest() {
		return small;
	}
	
	public void addValue(int x) {
		small = Math.min(small,x);
		big = Math.max(big,x);
	}
}
