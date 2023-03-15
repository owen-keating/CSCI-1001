
public class DiceRoll {

	public static void main(String[]args) {

		int[]nums = {2,3,4,5,6,7,8,9,10,11,12};
		String[]stars = {"2:  ","3:  ","4:  ","5:  ","6:  ","7:  ","8:  ","9:  ","10: ","11: ","12: " };
		int amount = 100;

		while(amount != 0) {

			int sum = 0;
			int roll1 = (int)(Math.random()*6+1);
			int roll2 = (int)(Math.random()*6+1);
			sum += roll1 + roll2;

			for(int i = 0; i < nums.length;i++) {

				if(sum == nums[i])

					stars[i] += "*";	
				
			}

			amount--;
			
		}

		for(int i = 0;i < stars.length;i++) {

			System.out.println(stars[i]);
			
		}

	}

}
