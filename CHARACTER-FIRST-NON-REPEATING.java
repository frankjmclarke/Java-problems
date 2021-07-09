  public int firstNonRepeatingCharacter(String string) {
    Map<Character,Integer> map = new HashMap<>();
		for (int i=0; i< string.length(); i++){
			Character ch = string.charAt(i);
			if (map.containsKey(ch))
				map.put(ch,-1);
			else
				map.put(ch,i);
		}
		int min = -1;	
		for(Integer i: map.values()){
			if (i>=0) {//first singleton
				if (min == -1)
					min = i;
				else
					if (i<min)
						min = i;
			}
		}
    return min;
  }