import java.io.*;
import java.util.*;
import java.math.*;



class Solution {
  public static void main(String[] args) {
    
    int n = 20;
    BigInteger fact = new BigInteger("1");
    fact = factorial(n);
    
    System.out.println("Recur "+factorialRecur(BigInteger.valueOf(n)) );

    BigInteger mod = new BigInteger("0"); 
    BigInteger tens = new BigInteger("10"); 
    int trailing = 0;
    while (true) {
      mod = fact.mod(tens);
      if (mod.equals(BigInteger.ZERO)) {
        trailing++;
        tens = tens.multiply(BigInteger.valueOf(10));
      }
      else
        break;
    }
    
    System.out.println(fact);
    System.out.println(trailing);

  }
  
  static BigInteger factorial(int n) {
    BigInteger fact = new BigInteger("1");
    for (int i=1; i<=n; ++i) {
      fact = fact.multiply(BigInteger.valueOf(i));           
    }
    return fact;   
  }
  
  static BigInteger factorialRecur(BigInteger n) {
    if (n.compareTo(BigInteger.ONE)==1)
      return n.multiply( factorialRecur(n.subtract(BigInteger.ONE)));  
    else
      return BigInteger.ONE;
  }
}
///////////////////////
import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  public static void main(String[] args) {
    
    int n = 20;
    long fact = 1;
    fact = factorial(n);
    
    System.out.println("Recur "+factorialRecur(n) );

    long mod = 0; 
    long tens = 10; 
    int trailing = 0;
    while (true) {
      mod = fact%tens;
      if (mod==0) {
        trailing++;
        tens*=10;
      }
      else
        break;
    }
    
    System.out.println(fact);
    System.out.println(trailing);

  }
  
  static long factorial(int n) {
    long fact = 1;
    for (int i=n; i>0; i--) {
      fact *= i;           
    }
    return fact;   
  }
  
  static long factorialRecur(long n) {
    if (n==0)
      return 1;
    else
      return n*factorialRecur(n-1);  
  }
}
