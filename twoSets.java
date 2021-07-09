class Solution {
  
  public static void main(String[] args) {
    for (int i=0;i<20;i++)
      twoSets(i);
  }
  
  static void twoSets (int num){
    int total = (num*(num+1))/2;
    int half = total/2;
    if (total%2==1) {
      System.out.println("NO for "+num);
      return;
    }
    int answer1 =0;
    String result="";
    for (int i=num; i>0; i--) {
      if (answer1+i>half)
        break;   
      answer1 += i;
      result=result+i +" ";
    } 
    for (int j=1; j<=num; j++) {
      if (answer1+j>half)
        break;
      answer1 += j;
      result=result +j +" ";
    }
    
    if (answer1 == half) {
      System.out.println("YES for "+num + " half "+half); 
      System.out.print(result); 
    } else{
      System.out.print("NO for "+num);    
    }
    System.out.println("");        

  }
  

}


///////////////////////////////
class Solution {
  
   public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     
        for (int ii=1; ii<=20;ii++) {
        double an = ii;
        double div = an/4;

        if(div == (int)div || (div+0.25) == (int)(div+0.25)){
            int s1 = (int)div;
            int s2 = (int)Math.ceil(div);
            StringBuilder l1 = new StringBuilder();
            StringBuilder l2 = new StringBuilder();
            int i,j,k;
            for (i=1,j=(int)an;i < s1+1; i++,j--) l1.append(i).append(" ").append(j).append(" ");
            int size = s1+s2;
            int size2 = s1+s2;
            for (k=s1+1;k<=size+s1;k++) l2.append(k).append(" ");
            if (s2!=s1){
                l1.append(j);
                l2.append(k);
                size2++;
            }
            System.out.println("YES "+ii+"\n"+l1+" "+l2);
        }else System.out.println("NO");
   }

    }
  

}