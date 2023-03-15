import java.util.Scanner;

public class Continue 
{
	
	public static void main(String[]args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Do you want to continue? ");
		
		String response = s.nextLine();
		
		if (response.equals("Y") || response.equals("Yes") || response.equals("Ok") || response.equals("Sure") || response.equals("Why Not")) 
		{
			System.out.print("Okay");
		}
		else if (response.equals("N") || response.equals("No")) 
		{
			System.out.print("Ending");
		}
		else 
		{
			System.out.print("Bad input");
		}
		
	}

}
