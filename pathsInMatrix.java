import java.io.*;
import java.util.*;

class Solution {
  
  public static void main(String[] args) { 
    int[][] matrix = {{0, 0, 0, 0, 1},
                      {1, 0, 1, 0, 0},
                      {0, 0, 1, 0, 0},
                      {0, 0, 0, 0, 0}};
                /*
                        1 1 1 1 0 
                        0 1 0 1 1 
                        0 1 0 1 2 
                        0 1 1 2 4 
      */

    int pathNum = Exercise.paths2(matrix,0, 0);
    pathNum= Exercise.paths(matrix);
    System.out.println(pathNum);
  }
  


  public static class Exercise {
      public static int paths2(int[][] matrix, int row, int col){
        int rowMax = matrix.length-1;
        int colMax = matrix[0].length-1;
        
        if (row > rowMax || col > colMax|| matrix[row][col]==1) {
          return 0;
        }
        
        if (row==rowMax && col ==colMax) {
          return 1;
        }
        
              
        return paths2 (matrix, row+1, col)+paths2 (matrix, row, col+1);

      }
    public static int paths(int[][] matrix){
      int n = matrix.length;
      int m = matrix[0].length;
      int[][] dp = new int[n][m];
      dp[0][0] = matrix[0][0] == 1 ? 0 : 1;
      for(int i = 1; i < m; i++){
      if(matrix[0][i] == 1) dp[0][i] = 0;
      else dp[0][i] = dp[0][i-1];
      }
      for(int i = 1; i < n; i++){
      if(matrix[i][0] == 1) dp[i][0] = 0;
      else dp[i][0] = dp[i-1][0];
      }
      for(int i = 1; i < n; i++){
      for(int j = 1; j < m; j++){
        if(matrix[i][j] == 1) dp[i][j] = 0;
        else dp[i][j] = dp[i-1][j] + dp[i][j-1];
      }
      }
      return dp[n-1][m-1];
    }
  }

}

