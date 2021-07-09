import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  
  
  public static void main(String args[]) throws IOException {
    
    //InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    //      String input = bufferedReader.readLine();
    //  nums[t]=Long.parseLong(input);
    //Integer.parseInt(bufferedReader.readLine());
    
    int t = 5;

    
    long[]nums ={1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
    System.out.println (totals(nums));
   
  }
  
  static long totals (long[] l) {
    long total =0;
    for (int i=0; i<l.length; i++)     
        total+=l[i];   
    return total;
    
  }
  



}
