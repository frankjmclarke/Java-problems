import java.util.*;

  public static int[] findThreeLargestNumbers(int[] array) {
    int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		
		for (int i=0; i< array.length; i++){
			int num = array[i];
			if (num <= largest[2] && num <= largest[1] && num > largest[0]) {
				largest[0] = num;
			} 
			else if (num <= largest[2] && num > largest[1] ) {
				if (largest[1] > largest[0])
					largest[0]=largest[1];
				largest[1] = num;
			}
			else if (num > largest[2]) {
				if (largest[1] > largest[0])
				  largest[0]=largest[1];
				if (largest[2] > largest[1])
				  largest[1]=largest[2];
				largest[2] = num;
			}
		}//end for

		return largest;
	}