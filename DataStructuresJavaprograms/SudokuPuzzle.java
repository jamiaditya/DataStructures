
public class SudokuPuzzle {

	public static int N = 9;
	public static boolean isColumnSafe(int[][] grid, int row, int num) {
		for(int i=0; i<N;i++) {
			if(grid[row][i]==num)return false;
		}
		return true;
	}
	public static boolean isRowSafe(int[][] grid, int col, int num) {
		for(int i=0; i<N;i++) {
			if(grid[i][col]==num)return false;
		}
		return true;
	}
	public static boolean isBoxSafe(int[][] grid, int row, int col, int num) {
		for(int i=(row-(row%3)); i<((row-(row%3))+3);i++) {
			for(int j=(col-(col%3)); j<((col-(col%3))+3);j++) {
				if(grid[j][i]==num)return false;
			}
		}
		return true;
	}
	
	public static boolean findUnAssigned(int[][] grid, int row, int col) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				row = i;
				col = j;
				//System.out.println(row+"-"+ col);
				if(grid[row][col]==0) return true;
			}
		}
		return false;
	}
	
	public static boolean isSafe(int[][] grid, int row, int col, int num) {
		System.out.println(row+" "+col+" "+num);
		return isBoxSafe(grid, row, col, num) && isColumnSafe(grid, row, num) && isRowSafe(grid, col, num);
	}
	public static int row=0, col=0;
//	public static int[][] grid;
	public static boolean solveSudoku(int[][] grid) {
		//int row, col;
		printSudoku(grid);
		if(!findUnAssigned(grid, row, col))return true;
		System.out.println(row+" "+col);
		for(int i=1; i<=N; i++) {
			//System.out.println(i);
			if(isSafe(grid, row, col, i)) {
				grid[row][col] = i;
				//System.out.println(col+" "+row+" "+i);
				if(solveSudoku(grid))return true;
			
				grid[row][col]=0;
			}
		}
		return false;
	}
	public static void printSudoku(int[][] grid) {
		for(int i=0;i<N; i++) {
			for(int j=0;j<N; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		System.out.println(grid[0][0]);
		if(solveSudoku(grid)) {
			printSudoku(grid);
		}else {
			System.out.println("No Solution");
		}
		
		
	}

}
