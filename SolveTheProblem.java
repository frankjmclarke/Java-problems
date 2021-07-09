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
    int []arr={4,5,1,-3,8};
    //int []arr={5,5,1,-3,8};
    
    System.out.println(findPair (arr,11));
  }
  
public class Exercise {
    static boolean findPair(int[] arr, int k){
        Set<Integer>aSet = new HashSet<Integer>();
        int limit = arr.length;
        for (int i=0; i<limit; i++){
            if (aSet.contains(k-arr[i])) {      
                System.out.println(arr[i]);
                return true;
            } else {
              aSet.add(arr[i]);              
            }

        }
        return false;
    }

}


}
