  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int first=0, last = array.size()-1;	
		while (first < last) {
			while (first < array.size() && array.get(first) != toMove)
				first++;//toMove
			while (last > 0 && array.get(last) == toMove)
				last--;//!toMove
			System.out.println(first +" "+last);
			if (first < last) {
				array.set(first, array.get(last));
				array.set(last, toMove);
			}
		}
    return array;
  }