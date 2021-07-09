import java.io.*;
import java.util.*;
import java.math.*;


class Solution {

  static void towerOfHanoi(int n, int start, int end) {
    if (n == 1){
      pm(start,end);//first move
      return;
    }
      int other =6-(start+end);
      towerOfHanoi(n-1, start, other);
      pm(start,end);
      towerOfHanoi(n-1, other, end);
  }
  
  static void pm(int from, int to) {
    System.out.println("Move "+from+ " => "+to);
  }
      
    //  Driver method
  public static void main(String args[]) {
      int n = 5; // Number of disks
      towerOfHanoi(n, 1,3); 
  }

}