
public class Binary {

	public static void main(String[]args) {

		int[]binary = new int[8];

		for(int i = 0; i < binary.length;i++) {

			binary[i] = (int)(Math.random()*2);
			System.out.print(binary[i]);

		}

		int decimal = 0;
		int count = 1;

		for(int i = binary.length-1; i >= 0;i--) {

			if(binary[i] == 1) {

				decimal += count;
			
			}
			
			count *= 2;

		}

		System.out.println("");
		System.out.print("The sum is: " + decimal);		

	}

}
