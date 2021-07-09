import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  
  
  public static void main(String args[]) {
    
    Integer[] arr ={0,12,1,2,-10,-3,4,10};
    boolean result = fun(arr); 
    System.out.println(result);
   
  }
  
  static boolean fun(Integer[] arr) {
    
   //  Set<Integer> set = new HashSet<>(Arrays.asList(arr));
    Set<Integer> set = new HashSet<Integer>();
    boolean found=false;
    int limit= arr.length;
    if (limit<2)
      return false;
    
    for (int i=0; i<limit; i++){
      if (set.contains(-arr[i])){
        System.out.println(arr[i]);
        return true;
      }
      set.add(arr[i]);
    }

    return found;
  }
  



}
