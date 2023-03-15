
public class Lexi {
	
	public static void main (String [] args) {
		
		String[] permutations = {   
				
				"abcd", "abdc", "acbd", "acdb", "adbc", "adcb", 
				"bacd", "badc", "bdac", "bdca", "bcad", "bcda", 
				"cabd", "cadb", "cbad", "cbda", "cdab", "cdba", 
				"dabc", "dacb", "dbac", "dbca", "dcab", "dcba"
				
		};

		for (String word : permutations) {
			System.out.print("" + word + ": ");
			testCase(word);
		}
		
	}
		
	public static void testCase(String combin) {
		
		 String a = "" + combin.charAt(0);
		 String b = "" + combin.charAt(1);
		 String c = "" + combin.charAt(2);
		 String d = "" + combin.charAt(3);
		
		 if(a.compareTo(b) < 0 && b.compareTo(c) < 0 && c.compareTo(d) < 0) 
		 {
			 System.out.println(a + b + c + d);
		 }
		 else if(a.compareTo(b) < 0 && b.compareTo(d) < 0 && d.compareTo(c) < 0) 
		 {
			 System.out.println(a + b + d + c);
		 }
		 else if(a.compareTo(c) < 0 && c.compareTo(b) < 0 && b.compareTo(d) < 0) 
		 {
			 System.out.println(a + c + b + d);
		 }
		 else if(a.compareTo(c) < 0 && c.compareTo(d) < 0 && d.compareTo(b) < 0) 
		 {
			 System.out.println(a + c + d + b);
		 }
		 else if(a.compareTo(d) < 0 && d.compareTo(b) < 0 && b.compareTo(c) < 0) 
		 {
			 System.out.println(a + d + b + c);
		 }
		 else if(a.compareTo(d) < 0 && d.compareTo(c) < 0 && c.compareTo(b) < 0) 
		 {
			 System.out.println(a + d + c + b);
		 }
		 else if(b.compareTo(a) < 0 && a.compareTo(c) < 0 && c.compareTo(d) < 0) 
		 {
			 System.out.println(b + a + c + d);
		 }
		 else if(b.compareTo(a) < 0 && a.compareTo(d) < 0 && d.compareTo(c) < 0) 
		 {
			 System.out.println(b + a + d + c);
		 }
		 else if(b.compareTo(d) < 0 && d.compareTo(a) < 0 && a.compareTo(c) < 0) 
		 {
			 System.out.println(b + d + a + c);
		 }
		 else if(b.compareTo(d) < 0 && d.compareTo(c) < 0 && c.compareTo(a) < 0) 
		 {
			 System.out.println(b + d + c + a);
		 }
		 else if(b.compareTo(c) < 0 && c.compareTo(a) < 0 && a.compareTo(d) < 0) 
		 {
			 System.out.println(b + c + a + d);
		 }
		 else if(b.compareTo(c) < 0 && c.compareTo(d) < 0 && d.compareTo(a) < 0) 
		 {
			 System.out.println(b + c + d + a);
		 }
		 else if(c.compareTo(a) < 0 && a.compareTo(b) < 0 && b.compareTo(d) < 0) 
		 {
			 System.out.println(c + a + b + d);
		 }
		 else if(c.compareTo(a) < 0 && a.compareTo(d) < 0 && d.compareTo(b) < 0) 
		 {
			 System.out.println(c + a + d + b);
		 }
		 else if(c.compareTo(b) < 0 && b.compareTo(a) < 0 && a.compareTo(d) < 0) 
		 {
			 System.out.println(c + b + a + d);
		 }
		 else if(c.compareTo(b) < 0 && b.compareTo(d) < 0 && d.compareTo(a) < 0) 
		 {
			 System.out.println(c + b + d + a);
		 }
		 else if(c.compareTo(d) < 0 && d.compareTo(a) < 0 && a.compareTo(b) < 0) 
		 {
			 System.out.println(c + d + a + b);
		 }
		 else if(c.compareTo(d) < 0 && d.compareTo(b) < 0 && b.compareTo(a) < 0) 
		 {
			 System.out.println(c + d + b + a);
		 }
		 else if(d.compareTo(a) < 0 && a.compareTo(b) < 0 && b.compareTo(c) < 0) 
		 {
			 System.out.println(d + a + b + c);
		 }
		 else if(d.compareTo(a) < 0 && a.compareTo(c) < 0 && c.compareTo(b) < 0) 
		 {
			 System.out.println(d + a + c + b);
		 }
		 else if(d.compareTo(b) < 0 && b.compareTo(a) < 0 && a.compareTo(c) < 0) 
		 {
			 System.out.println(d + b + a + c);
		 }
		 else if(d.compareTo(b) < 0 && b.compareTo(c) < 0 && c.compareTo(a) < 0) 
		 {
			 System.out.println(d + b + c + a);
		 }
		 else if(d.compareTo(c) < 0 && c.compareTo(a) < 0 && a.compareTo(b) < 0) 
		 {
			 System.out.println(d + c + a + b);
		 }
		 else
		 {
			 System.out.println(d + c + b + a);
	}

	}
	
}
