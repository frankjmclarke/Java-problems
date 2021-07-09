import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  
  
  public static void main(String args[]) throws IOException {

    String str ="abcdbeghef";
    str ="aaaaa";
    str = "eddyzooz";
    str= "abcb";

    int result = Exercise.longestRepeatingSubstring(str);
    //System.out.println(result);    
  }
  

public static class Exercise {

    public static int longestRepeatingSubstring(String str){
      int max = 0;
      int size=str.length();
      int left = 0;
      int right;
      int[] indices = new int[128];
      
      for (int i=0;i<indices.length;i++)
        indices[i] = -1;
      
      for (int i=0; i<size; i++){
        right = indices[(int)str.charAt(i)];
        if (right >= left)
          left = right+1;      
        indices[(int)str.charAt(i)]=i;        
        max = Math.max(max, (i-left)+1);  
        System.out.println(i+" "+left+" "+right+" max= "+max);   
      }

      return max;
    }
  }
}