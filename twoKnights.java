class Solution {
  
  public static void main(String[] args) {
    twoKnights(8);
  }
  
  static void twoKnights (int num){
    
    for (int i=1; i<= num; i++){
      int result = 4 *(i-1)*(i-2);// 2x3 and 3x2 overlapping rectangles with 2 pieces each
      int max = (i*i);//positions 1 knight can occupy
      max*= (i*i-1);//then positions other knight can be
      max/=2;//duplicates
      System.out.println(max-result);    
    }

  }
  

}