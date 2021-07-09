import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
  
  static TreeSet<String> solution = new TreeSet<String>();
  
  public static void main(String args[]) {
    
    anagram ("","aabac");
    printList(solution);
   
  }
  
  static void anagram(String left, String right) {
    int limit = right.length();  
    if (limit==0) {
      solution.add(left);
      //System.out.println(left);
    }
    else {
      for (int i =0; i<limit ;i++) {
        anagram(left+right.substring(i,i+1),right.substring(0,i)+right.substring(i+1,limit)); 
        }
    }
  }
  
  static void printList(TreeSet<String> ts) {
    System.out.println(ts.size());
    Iterator<String> iterator = ts.iterator();
    while (iterator.hasNext())
        System.out.println(iterator.next());
  }


}