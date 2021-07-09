class Solution {
  public static void main(String[] args) {
    int []arr ={3, 2, 5, 1, 7}; 
    int result =increase(arr);
    System.out.println(result);
  }
  
  static int increase (int [] arr){
    int limit = arr.length;
    int pre=arr[0];
    int steps=0;
    int in;
    for (int i=1;i<limit;i++) {
      in = arr[i];
      if (pre > in)
        steps += pre -in;
      else
        pre = in;
      
    }

    return  steps;
  }
}