  public static boolean isMonotonic(int[] array) {
		boolean up = true;
		boolean down = true;
		if (array.length <3)
			return true;
    for (int i=0; i < array.length-1; i++){
			if (array[i]>array[i+1]) {
				up = false;
			}
			if (array[i]<array[i+1]) {
				down = false;
			}	
			System.out.println(i);
		}
		if (up && down)
			return true;
		if (up)
			return !down;
		if (down)
			return !up;
		return false;
  }