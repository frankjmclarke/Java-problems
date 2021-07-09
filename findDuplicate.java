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
    int[]in = {66,4,2,5,3,66,3,1,2,3,3,3,3,3,-3};
    int result = Exercise.findDuplicate(in);

    //for (int i=0; i< limit;i++) {
      System.out.println(result);    
    //}

  }
  
public static class Exercise {
    public static int findDuplicate(int[] arr){
      Set<Integer> set = new HashSet<Integer>();
      int limit = arr.length;
      for (int i=0; i< limit; i++) {
        int data =arr[i]; 
        if (set.contains(data))
          return data;
        set.add(data);
      }
      return -1;
    }
}



}


}
////////////////////////
public static class Exercise {
    public static int findDuplicate(int[] arr){
      int hare = 0, tortoise = 0;
      do{
        tortoise = arr[tortoise];
        hare = arr[arr[hare]];
        System.out.println("*t "+tortoise + " h"+hare);
      }while(tortoise != hare);
      tortoise = 0;
      while(tortoise != hare){
        tortoise = arr[tortoise];
        hare = arr[hare];       
        System.out.println("@t "+tortoise + " h"+hare);
      }
      return tortoise;
    }
}

