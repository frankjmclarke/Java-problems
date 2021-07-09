import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  
  
  public static void main(String args[]) throws IOException {

    int[]arr={18,17};

    int result = findPeak(arr);
    System.out.println(result);    
  } 
  
  public static int findPeak(int[] arr){
    int len = arr.length;
    if (len < 2)
      return 0;
    int left=Integer.MIN_VALUE;
    int i;
    for (i=0; i<len-1;i++) {
      if (arr[i]>=left && arr[i]>=arr[i+1])
        return i;
      left = arr[i];
    }
    if (arr[i]>=left)
        return i;
    return -1;
  }

}

///////////////////////////

class Solution {
   
  public static void main(String args[]) throws IOException {

    //int[]arr={1,4,5,8,3};
    int[]arr={1,8,2,-3};

    int result = findPeak(arr);
    System.out.println(result);    
  } 
  
  public static int findPeak(int[] arr){
    int len = arr.length;
    if (len < 2)
      return 0;

    int pointer = len/2;
  
    while (true){
      System.out.println("#"+pointer); 
      if (pointer == 0){
        System.out.println("&");  
        if (arr[pointer]>=arr[pointer+1]) 
          return 0;
        return 1;
      }
      if (pointer==len-1) {
        System.out.println("**");  
        if (arr[pointer]>=arr[pointer-1]) 
          return pointer;
        return pointer-1;
      }
      if (arr[pointer]>=arr[pointer-1] && arr[pointer]>=arr[pointer+1]) {
              System.out.println("@@");  
        return pointer;
      }
      if (arr[pointer]>arr[pointer+1]) {
        System.out.println("left");
        pointer --;
        continue;
      }
      if (arr[pointer-1]>arr[pointer]) {
        System.out.println("left2");
        pointer --;
        continue;
      }
      pointer++;     
      
    }    

  }

}
//////
static int findPeak(int[] arr){
  int left = 0;
  int right = arr.length-1;
  while(left < right){
    int mid = (left + right)/2;
    if(arr[mid] < arr[mid+1]) left = mid+1;
    else right = mid;
  }
  return left;
}
