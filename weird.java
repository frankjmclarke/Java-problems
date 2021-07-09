class Solution {
  public static void main(String[] args) {

    weird(3);
  }
  
  static void weird(int n){
    while (n!=1){
      if (n%2==0)
        n/=2;
      else 
        n=n*3+1;
    System.out.print(n+" ");
    }
    
  }
}
