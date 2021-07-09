import java.util.*;

class Program {

  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    Hashtable<String, Integer> table = new Hashtable<>();
		
		Integer hiScore=0;
		int index;
		String winner="Error";
		
		for (int i = 0; i < competitions.size(); i++) {
			if (results.get(i) == 0) 
				index = 1;
			else
				index = 0;
			String name = competitions.get(i).get(index);
			Integer total = 3;
			if (table.containsKey(name)) {
				total += table.get(name);
			}
			table.put(name,total);
			if (total > hiScore) {
				hiScore = total;
				winner = name;
			}
		}
    return winner;
  }
}