
public class PennyPitch {

	public static void main(String[]args) {
		
		String[][] grid = {{"1","1","1","1","1"}, {"1","2","2","2","1"}, {"1","2","3","2","1"}, {"1","2","2","2","1"}, {"1","1","1","1","1"}};
								
		for(int i = 0; i<grid.length; i++) {
			
			for(int j=0; j<grid[i].length; j++) {
				
				System.out.print(grid[i][j] + " ");
				
			}
			
			System.out.println();
		
		}
		
		System.out.println();
		int n = 0;
		int score = 0;
		
		while(n<3) {
			
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			
			if((grid[x][y]).equals("P"))
				continue;
				
			if((grid[x][y]).equals("1"))
				score++;
			
			if((grid[x][y]).equals("2"))
				score+=2;
			
			if((grid[x][y]).equals("3"))
				score+=3;
			
			grid[x][y] = "P";
			
			for(int i = 0; i<grid.length; i++) {
				
				for(int j=0; j<grid[i].length; j++) {
					
					System.out.print(grid[i][j] + " ");
					
				}
				
				System.out.println();
			
			}
		
		System.out.println();
		n++;
		
		}
		
		System.out.println("Score: " + score);
		
	}
	
}
