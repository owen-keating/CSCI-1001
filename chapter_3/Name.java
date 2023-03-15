
public class Name {

	private String first;
	private String middle;
	private String last;
	
	public Name() {
		first = "";
		middle = "";
		last = "";	
	}
	
	public Name(String f, String m, String l) {
		first = f;
		middle = m;
		last = l;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getLast() {
		return last;
	}
	
	public String getFullName() {
		return first + " " + middle + " " + last;
	}
	
	public String getMixedName() {
		return last + ", " + first + " " + middle;
	}
	
	public String getInitials() {
		return first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
	}
	
	public int getLength() {
		return first.length() + middle.length() + last.length();
	}
	
}
