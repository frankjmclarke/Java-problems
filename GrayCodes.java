import java.io.*;
import java.util.*;
import java.math.*;


class Solution {

  public static void main(String[] args) {
      generateGrayarr(3);
  }

  static void generateGrayarr(int n)
  {
      // base case
      if (n <= 0)
          return;

      ArrayList<String> arr = new ArrayList<String> ();

      // start with one-bit pattern
      arr.add("0");
      arr.add("1");

      int i, j;
      int size;
      for (i = 2; i < (1<<n); i = i<<1){
        size=arr.size();
        for(j=size-1; j>=0;j--)//append reversed set
          arr.add(arr.get(j));

        for(j=0; j<size;j++)
          arr.set(j,"0"+arr.get(j));//first half gets zeroes

        for(; j<arr.size();j++)
          arr.set (j,"1"+arr.get(j));//secon half gets ones

      }

      // print contents of arr[]
      for (i = 0 ; i < arr.size() ; i++ )
          System.out.println(arr.get(i));
  }

}