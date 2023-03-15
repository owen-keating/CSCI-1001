
public class QuadraticEquation2 {

	private int a;
	private int b;
	private int c;
	
	public QuadraticEquation2(int first, int second, int third) {
		a = first;
		b = second;
		c = third;
	}
	
	public String getNumSolns(double x) 
	
	{
		
		x = (Math.pow(b,2)-4*a*c);
		
		if(x > 0) 
		{
			return "2 real solutions";
		}
		else if(x == 0) 
		{
			return "1 real solution";
		}
		else 
		{
			return "2 complex solutions";
		}
		
	}
	
	public String getSolns()
		
		{
			if ((Math.pow(b,2)-4*a*c) > 0) 
			{
				return (-1*b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a) + " and " + (-1*b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
				 
			}
			else if ((Math.pow(b,2)-4*a*c) == 0) 
			{
				return (-1*b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a) + " ";

			}
			else 
			{
				return "" + (-1.0*b/(2*a))+ " + " + (Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c)))/(2*a) + "i and " + (-1.0*b/(2*a)) + " - " + (Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c)))/(2*a) + "i"; 
			}

	}
}
