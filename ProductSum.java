	public static int sum(List<Object> array, int depth) {		
		int total = 0;
		
		for (Object obj: array){
			if (obj instanceof ArrayList){
				List<Object> arr = (ArrayList<Object>) obj;
				total += sum(arr, depth+1);
			} else {
				total += (int) obj;
			}
		}
		
		
		return total * depth;
	}
	
  public static int productSum(List<Object> array) {
    return sum(array,1);
  }