  public static int longestPeak(int[] array) {
		int max = 0;
		int i = 1;
    while  (i< array.length){
			int peak = 0;
			boolean up = false;
			while (i< array.length &&  array[i]>array[i-1]){
				i++;//going up
				peak++;
				up = true;
			}
			if (i< array.length && array[i]==array[i-1]) {
				i++;
				continue;//plateau
			}
			boolean down = false;
			while (i< array.length && array[i]<array[i-1]) {
				i++;//going down
				peak++;	
				down = true;
			}
			if (!up)
				continue;
			if (!down)
				continue;
			if (peak>0)
				peak ++;
			if (peak>max)
				max= peak;
		}
    return max;
  }