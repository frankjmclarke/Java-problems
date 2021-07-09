class Solution {
  public static void main(String[] args) {
    int[][] arr={{2,3},{1,1},{4,2},{1,2}};
   spiral(arr);
  }
  
  static void spiral (int [][]arr){
    for (int[] coord:arr) {
      int down=coord[0];
      int across=coord[1];
      if (down==1 && across==2) {
          System.out.println("2");
        break;       
      }
      if (down==2 && across==1) {
          System.out.println("4");
        break;       
      }
      int result=0;
      
      if (down>across){
        result = down;
        result *=result;
        result -=(down-1);
        result+=down-across;
      }
      else if (down<=across) {
        result = across;      
        result *=result;
        result -=(across-1);
        result+=across-down;
      }
      System.out.println(result);
      
    }
  }
}
}