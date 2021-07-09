import java.io.*;
import java.util.*;

class Solution {
  
  public static void main(String[] args) { 
    int[][] matrix = {{3, 12, 4, 7, 10}, {6, 8, 15, 11, 4}, {19, 5, 14, 32, 21}, {1, 20, 2, 9, 7}};

    int row = matrix.length-1;
    int col = matrix[0].length-1;
    //int result = Exercise.minimumCostPath(matrix,row,col);  
    //System.out.println(result);
    int cost[][]= {{1, 2, 3}, {4, 8, 2}, {1, 5, 3}};
    System.out.println(Exercise.minCost(matrix,row,col));
  }
  
  public static class Exercise {
    public static int minimumCostPath(int[][] matrix, int row, int col){
//2^N, where N is the max of M and N
//Space Complexity: O(N)(Recursive stack space)
      if (col <0 || row <0)
        return Integer.MAX_VALUE;
      int current =matrix[row][col];
      if (col==0 && row==0)
        return current;

      return (current+ 
              Math.min (minimumCostPath(matrix, row-1, col),
                        minimumCostPath(matrix, row, col-1)));

    }

    
    public static int minCost(int cost[][], int m, int n) {
        int i, j;
        int tc[][]=new int[m+1][n+1];
 
        tc[0][0] = cost[0][0];
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];
 
        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = Math.min(tc[i-1][j],
                               tc[i][j-1]) + cost[i][j];
      
          for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
              System.out.print(tc[i][j]+" ");
            }
            System.out.println();
          }
 
        return tc[m][n];
    }
 
  
  }
}