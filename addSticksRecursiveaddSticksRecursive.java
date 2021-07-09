
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        int [] sticks = {1,1,2,2,2};
        boolean result = makesquare(sticks);
        System.out.println("result = "+ result);
    }
    
    static boolean isSameSize(int[] sides,int pos){ //if 2 sides are the same length, reuse the size calculation
        for(int i=0;i<pos;i++){
            if(sides[i]==sides[pos])
                return true;//we have already done a recursive call on a side of that length
        }
        return false;
    }
    // recursion
    static boolean addSticksRecursive(int[] sides,int pos,int target,int[] sticks){
        //try each stick on each side recursively until desired result

        if(pos==sticks.length) //return final answer
            return sides[0]==target && sides[1]==target && sides[2]==target && sides[3]==target;
        for(int i=0;i<4;i++){
            if(sides[i]+sticks[pos]>target || isSameSize(sides,i)) //too big, try another side
                continue;
            sides[i]+=sticks[pos];//side get longer
            if(addSticksRecursive(sides, pos+1, target, sticks))
                return true;//all finished!!
            // try a different side
            sides[i]-=sticks[pos];
        }
        return false;
    }
    
    static boolean makesquare(int[] sticks) {
        // sanity checks
        int sum=0;
        for (int i:sticks)  
            sum = sum + i;  
        //Integer[] sticks = new Integer[aint.length];
        //Arrays.sort(sticks, Collections.reverseOrder());
        //Arrays.sort(sticks); 
        int numSides = 4;
        int[] sides = new int[numSides];

        if(sum%4 >0 || sticks.length < numSides)
            return false;
        sum/=numSides;
        if(sticks[0]>sum)
            return false;
 
        return addSticksRecursive(sides,0,sum,sticks);
    }
}
