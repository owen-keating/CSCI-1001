import java.util.*;

public class LexiHeaven {
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		List<String>words = new ArrayList(Arrays.asList());
		int count = 0;
		
		while(count!=-1) {
			
			System.out.print("-1 to stop. Word: ");
			String word = s.nextLine();
			if(word.equals("-1")) {
				count = -1;
				break;
			}
			words.add(count, word);
			count++;
			
		}
		
		System.out.println();
		
		for(String x: words) {
			
			System.out.println(x);
		
		}
		
		System.out.println();
		Collections.sort(words);
		
		for(String x: words) {
			
			System.out.println(x);
		
		}
		
	}
	
}
