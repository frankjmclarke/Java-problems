import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  public static void main(String[] args) {
    
    int[][] nums={{2,1},{2,2},{5,7}};
    
    for (int[] test:nums){
      if (piles(test[0],test[1]))
        System.out.println("YES");
      else
        System.out.println("NO");
    }

  }
  
  static boolean piles(int a, int b) {
    if (((2*a-b)%3==0) && ((2*b-a)%3==0))
        return true;
    return false;   
  }
  /*
  2 equations can be formed

x + 2y = a

2x + y = b

Solving for x, x = (2b-a)/3, if x is an integer return YES else NO*/

}