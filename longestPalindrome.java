  public static int longestPalindrome(String str){
    int[]ascii = new int[128];
    for (char ch: str.toCharArray())
      ascii[(int)ch]++;
    
    boolean odd=false;    
    int length=0;
    for (int i:ascii){
      if (i>0){
        if (i%2==0) 
          length +=i;
        else {
          length +=i-1;
          odd=true;
        }
      }
    }
    if (odd)
      return length+1;
    else
      return length;
  }