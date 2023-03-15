import java.util.*;

public class GetInLine {

	public static void main(String[]args) {

		List<String>names = new ArrayList(Arrays.asList("Andrew", "Sarah", "Will", "Evelyn", "David"));
		
		names.add(5, "Steven");
		
		for(String x: names) {

			System.out.println(x);
		
		}

		System.out.println("");
		names.remove(3);

		for(String x: names) {

			System.out.println(x);
			
		}

		System.out.println("");
		names.add(1, "Samantha");

		for(String x: names) {

			System.out.println(x);

		}

		System.out.println("");
		System.out.println(names.indexOf("Will"));
		System.out.println("");
		names.add(names.size(), "Jessica");

		for(String x: names) {

			System.out.println(x);

		}

		names.remove(3);
		names.add(names.size(), "Will");
		System.out.println("");

		for(String x: names) {

			System.out.println(x);

		}

		System.out.println("");
		System.out.println(names.get(names.size()-2));
		String y = "";
		y = names.get(0);
		names.set(0, names.get(names.size()-1));
		names.set(names.size()-1, y);
		System.out.println("");

		for(String x: names) {

			System.out.println(x);

		}

		System.out.println("");
		boolean inLine = false;
		
		for(int i = 0; i<names.size();i++) {

			if(names.get(i).contentEquals("David")) 

				inLine = true;	

		}

		if(inLine)

			System.out.println("There is a David in line!");

		else

			System.out.println("There is not a David in line!");

		System.out.println("");
		System.out.println("Enter a name:");
		Scanner s1 = new Scanner(System.in);
		String z = s1.nextLine();
		System.out.println("Enter a position:");
		Scanner s2 = new Scanner(System.in);
		int n = s2.nextInt();

		if(n <= names.size())

			names.add(n, z);

		for(String x: names) {

			System.out.println(x);

		}

		for(int i = 0;i < names.size();i++) {

			if(names.get(i).indexOf("S") == 0) {

				names.remove(i);
				i--;

			}	

		}

		System.out.println("");

		for(String x: names) {

			System.out.println(x);

		}

	}

}
