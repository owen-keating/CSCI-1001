
public class AntWalk {

	public static void main(String[]args) {
		
		int[][] grid = new int[9][9];
		
		int x = 3;
		int y = 3;
		grid[x][y] = 1;
		
		for(int i = 0; i<grid.length; i++) {
			
			for(int j=0; j<grid[i].length; j++) {
				
				System.out.print(grid[i][j] + " ");
				
			}
			
			System.out.println();
		
		}
		
		System.out.println();
		int count = 1;
		String direction = "";
		
		while(x!=-1 || x!=9 || y!=-1 || y!=9) {
			
			int n = (int)(Math.random()*4+1);
			
			if(n==1)
				x--;
			
			if(n==2)
				x++;
			
			if(n==3)
				y--;
			
			if(n==4)
				y++;
			
			if(y==-1)
				direction = "West";
			
			if(y==9)
				direction = "East";
			
			if(x==-1)
				direction = "North";
			
			if(x==9)
				direction = "South";
			
			if(x==-1 || x==9 || y==-1 || y==9)
				break;
			
			grid[x][y] = grid[x][y] + 1;
			count++;
			
			for(int i = 0; i<grid.length; i++) {
				
				for(int j=0; j<grid[i].length; j++) {
					
					System.out.print(grid[i][j] + " ");
					
				}
				
				System.out.println();
			
			}
			
			System.out.println();
			
		}
		
		System.out.println("Number of moves: " + count);
		System.out.println();
		System.out.println("Direction of fall: " + direction);
		
	}
	
}
