import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  

    public static void main(String[] args) throws IOException {
      int num=10000;
      BigInteger big = new BigInteger("2");
      big = big.pow(num);
      big = big.mod(new BigInteger("1000000007"));
      System.out.println(big);
      System.out.println(Integer.MAX_VALUE);    
    }

}