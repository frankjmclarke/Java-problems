import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  static int[] totals = new int[26];
  
  public static void main(String[] args) {
    
    String str = "AAAAAABAAAA";
    
    if (isPalindrome(str)) {      
      System.out.println(getPalindrome(str));
    } else
      System.out.println("NO SOLUTION");   

  }
  
  static boolean isPalindrome(String str) {
    int limit = str.length(); 
    
    for (int i=0; i<limit; i++){
      char ch = str.charAt(i);
      totals[ch-'A']++;        
    }
    
    int oddOnes=0;
    boolean isEven = str.length()%2 == 0; 
    
    if (isEven)
      for(int tot:totals){ //only false if we have an odd total
          if (tot%2==1)
            return false;
      }
    else 
      for(int tot:totals){ //only false if an even number of odd totals
          if (tot%2==1)
            oddOnes++;
      }
    
    if (!isEven && oddOnes%2==0)
      return false;


    return true;   
  }
  
  static String getPalindrome(String str){
    char[] result = new char[str.length()];
    int resultIndex=0;
    
    for (int i=0; i<totals.length; i++){
      while (totals[i]>0) {
        char ch =(char) ('A'+i);
        if (totals[i]==1) {
          result[resultIndex]=ch;
          totals[i]--; 
        } else {
          result[resultIndex]=ch;
          result[(result.length-1)-resultIndex]=ch;
          totals[i]-=2; 
        }
        resultIndex++;
      }
    
    }   
    String palin = new String(result);
    return palin;
    
  }

}
