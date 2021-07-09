import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
		Arrays.sort(queries);
		int len = queries.length;
		int total = 0;
		for (int i = 1; i < len; i++) {
			total += queries[i-1] * (len-i);			
		}
			
    return total;
  }
}