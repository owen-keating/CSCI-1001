
public class Tree {
	
	public static void main(String[]args) {
	
	String a = "     ";
	
	for (int x = 1; x <= 5; x++) { 
	
		System.out.print(a);
		a = a.substring(1);
  	 	
		for (int y = 1; y <= x; y++) {
	  	 	
			System.out.print("**");
	  	 	 
		}
	  	 	
		System.out.println("");
	 	
	}
	
	for (int c = 1; c <= 3; c++) {
  	 	
  	 	System.out.println("     **");
  	 	
  	 	}
	
	}
	
}