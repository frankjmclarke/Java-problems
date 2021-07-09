import java.util.*;
//leetcode Time Complexity: O(N * M)
//Space Complexity: O(L) or O(N * M + L) if duplicate array
public class Main {

  public static List<Integer> riverSizes() {
		List<Integer> result = new ArrayList<>();
		int matrix[][] =  
       {{0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		int r = matrix.length;
		int c = matrix[0].length;
		
		Integer size;
		for (int ri = 0; ri < r; ri++)
			for (int ci = 0; ci < c; ci++) {
				size = trav(matrix, ri, ci);
				if (size>0)
					result.add(size);
			}
    return result;
  }
	
	public static Integer trav(int[][] matrix, int row, int col) {
		int r = matrix.length;
		int c = matrix[0].length;
		
		if (row < 0 || row >= r || col < 0 || col >= c )
			return 0;
		
		if (matrix[row][col] < 1)
			return 0;

		matrix[row][col] = -1;

		Integer size;
		size = 1 + trav(matrix, row-1, col)
		+ trav(matrix, row+1, col)
		+ trav(matrix, row, col-1)
		+ trav(matrix, row, col+1);		
		
		return size;
	}
}
    

ISLANDS