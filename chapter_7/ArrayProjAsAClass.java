
public class ArrayProjAsAClass {
  
	public static void main(String args[]) {
    
		System.out.println("ArrayProj\n");
		
		int scores[] = { 92, 88, 85, 99, 67, 85, 44, 77 };

		arrayPrint(scores);
		System.out.println("\nSum of scores is " + arraySum(scores));
		System.out.println("Avg of scores is " + arrayAvg(scores));
		System.out.println("Max of scores is " + arrayMax(scores));
		System.out.println("scores after arrayReverse ");
		arrayReverse(scores);
		arrayPrint(scores);
		System.out.println("scores after arrayShiftLeft ");
		arrayShiftLeft(scores,100);
		arrayPrint(scores);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println(arrayHasDuplicates(scores));

	}
  
	public static void arrayPrint(int a[]) {
    
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ "\t");
		}
  
	}
 
	public static int arraySum(int a[]) {
    
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

	public static double arrayAvg(int a[]) {
      
		return (double)arraySum(a)/a.length;  
 
	}

	public static int arrayMax(int a[]) {
  	
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	
	public static void swap(int a[], int x, int y) {
    
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
	}

	public static void arrayReverse(int a[]) {
   
		for(int i=0; i<a.length/2; i++) {
			swap(a,i,a.length-1-i);
		}	
	}

	public static void arrayShiftLeft(int a[], int x) {
   
		for(int i=1; i<a.length; i++) {
			a[i-1]=a[1];
		}
		a[a.length-1]=x;
	}
	
	public static boolean arrayHasDuplicates(int a[]) {
    
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j])
					return true;
			}
		}
		return false;
	}

}
