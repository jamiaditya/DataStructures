import java.util.Date;

public class SudokuPuzzle {

	public int N = 9;
	public boolean isColumnSafe(int[][] grid, int row, int num) {
		for(int i=0; i<N;i++) {
			if(grid[row][i]==num)return false;
		}
		return true;
	}
	public boolean isRowSafe(int[][] grid, int col, int num) {
		for(int i=0; i<N;i++) {
			if(grid[i][col]==num)return false;
		}
		return true;
	}
	public boolean isBoxSafe(int[][] grid, int row, int col, int num) {
		for(int i=(row-(row%3)); i<((row-(row%3))+3);i++) {
			for(int j=(col-(col%3)); j<((col-(col%3))+3);j++) {
				if(grid[i][j]==num)return false;
			}
		}
		return true;
	}
	
	public boolean findUnAssigned(int[][] grid, Sample s) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				s.row = i;
				s.col = j;
				//System.out.println(i+"-"+ j);
				if(grid[i][j]==0) return true;
			}
		}
		return false;
	}
	
	public boolean isSafe(int[][] grid, int row, int col, int num) {
		return isBoxSafe(grid, row, col, num) && isColumnSafe(grid, row, num) && isRowSafe(grid, col, num);
	}
	
	public boolean solveSudoku(int[][] grid) {
		count++;
		int row = 0, col = 0;
		Sample s = new Sample();
		if(!findUnAssigned(grid, s))return true;
		row = s.row; col = s.col;
		for(int i=1; i<=N; i++) {
			if(isSafe(grid, row, col, i)) {
				grid[row][col] = i;
				if(solveSudoku(grid))return true;
			
				grid[row][col]=0;
			}
		}
		return false;
	}
	public void printSudoku(int[][] grid) {
		for(int i=0;i<N; i++) {
			for(int j=0;j<N; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static Integer count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SudokuPuzzle s = new SudokuPuzzle();
		System.out.println(new Date());
		int[][] grid= {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};
		if(s.solveSudoku(grid)) {
			s.printSudoku(grid);
			System.out.println(new Date());
		}else {
			System.out.println("No Solution");
			System.out.println(new Date());
		}
		//System.out.println(count);
	}

	class Sample{
		int row, col;
	}
}
