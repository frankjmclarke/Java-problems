class Solution {
  public static void main(String[] args) {
    String str="ATTCGGGAAAAAAAA";
    int result =reps(str);
    System.out.println(result);
  }
  
  static int reps (String str){
    int limit = str.length()-1;
    int total=1;
    int max=1;
    for (int i=0;i<limit;i++) {
      if (str.charAt(i)==str.charAt(i+1)) {
        total++;
        if (total > max) 
          max = total;
      }
      else {
        total=1;
      }
      
    }

    return  max;
  }
}
