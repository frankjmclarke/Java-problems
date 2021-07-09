public class Main {
  public static void main(String[] args) {
    boolean result = isInterleave("ab","cd","acdb");
    System.out.println(result);
  }
    static int N1, N2, N3;
    static String s1,s2,s3;
    
    static boolean is_Interleave(int index1, int index2) {
        int index3 = index1+ index2;
        if (index3 == N3) return true;
           
        if (index1 < N1 && s1.charAt(index1) == s3.charAt(index3) && is_Interleave(index1+1, index2)) return true;

        if (index2 < N2 && s2.charAt(index2) == s3.charAt(index3) && is_Interleave(index1, index2+1)) return true;
        
        return false;
    }
    
    static boolean isInterleave(String ss1, String ss2, String ss3) {
        if (ss1.length() + ss2.length() != ss3.length()) {
            return false;
        }
        s1 = ss1;
        s2 = ss2;
        s3 = ss3;
        N1 = s1.length();
        N2 = s2.length();
        N3 = s3.length();
        return is_Interleave(0,0);
    }
}
//LEETCODE
public class Solution {
        
    public boolean is_Interleave(String s1, String s2, String s3, int index1, int index2) {
        int index3 = index1 + index2;
        int L1=s1.length();
        int L2=s2.length();
        int L3=s3.length();
        
        if (index3 == L3) return true;
        
        if ((index1 < L1 && s1.charAt(index1) == s3.charAt(index3)) && 
            is_Interleave( s1,  s2,  s3, index1+1,  index2)) return true;
        
        if ((index2 < L2 && s2.charAt(index2) == s3.charAt(index3)) && 
            is_Interleave( s1,  s2,  s3, index1,  index2+1)) return true;
        
        return false;


    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        return is_Interleave(s1,  s2, s3, 0 ,0);
    }
}