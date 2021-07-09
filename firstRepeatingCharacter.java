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

    char s = Exercise.firstRepeatingCharacter ("x0nsie cod");
    System.out.println(s);
  }
  
public static class Exercise {
    public static char firstRepeatingCharacter(String str){
      Set<Character> set= new HashSet<Character>();
      
      int limit = str.length();
      for (int i=0; i< limit;i++) {
        char ch= str.charAt(i);
        if (set.contains(ch)) {
          return ch;
        } else {
          set.add(ch);
        }
      }
      
      return'\0';
    }
}



}
