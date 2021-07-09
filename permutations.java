class Solution {
  public static void main(String[] args) {
   beautiful(2);
  }
  
  static void beautiful (int limit){
    if (limit == 0)
      System.out.print("0");
    else if (limit == 2 || limit == 1)
      System.out.print("NO SOLUTION"); 
    else {
      for (int i=0;i<limit;i+=2) {
        System.out.print(i);     
      }
      for (int i=1;i<limit;i+=2) {
        System.out.print(i);     
      }
    }
    System.out.println(); 
  }
}