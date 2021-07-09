class Solution {
  public static void main(String[] args) {
    int arr[]={2,3,1,5};
    int result =missing(5,arr);
    System.out.println(result);
  }
  
  static int missing (int n, int[] arr){
    int limit = arr.length;
    int total=0;
    int expected = 0;
    int i;
    for (i=0;i<limit;i++){
      total+= arr[i];
      expected += i+1;
    }
    expected+=i+1;
    return expected - total;
  }
}