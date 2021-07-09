import java.util.*;

class Program {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	int lowest = Integer.MAX_VALUE;
	TreeSet<Integer> ts = new TreeSet<>();

  public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
    for (int i = 0; i < coins.length; i++) {
			int newCoin = coins[i];
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

			for (ArrayList<Integer> a :result) //copy existing coins
				temp.add(new ArrayList<Integer>(a));
			
			for (ArrayList<Integer> a :temp)//existing plus new coin
				a.add(newCoin);
			
			ArrayList<Integer> one = new ArrayList<>();
			one.add(newCoin);
			temp.add(one);
			
			result.addAll(temp);
		}

		for (ArrayList<Integer> a : result) {
			int tot=0;
			for (Integer i : a) {
				tot+=i;
			}	
			ts.add(tot);
		}


		for (int i=1;i<Integer.MAX_VALUE;i++){
			if (!ts.contains(i))
				return i;
		}

    return 0;
  }

//trick version  
public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		
		int total = 0;
    for (int coin :coins) {
			if (coin > total+1)
				return total+1;
			total+=coin;			
		}
		return total+1;
	}
}