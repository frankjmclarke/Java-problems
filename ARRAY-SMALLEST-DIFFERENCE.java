  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int one=0, two=0;
		int[] smallestPair = new int[2];
		int smallest = Integer.MAX_VALUE;
    while (one < arrayOne.length && two < arrayTwo.length) {
			int firstNum = arrayOne[one];
			int secondNum = arrayTwo[two];
			int current = Math.abs(firstNum-secondNum);
			if (firstNum < secondNum)
				one++;
			else	if(secondNum < firstNum)
				two++;	
			else {
				smallestPair[0] = firstNum;
				smallestPair[1] = secondNum;
				return smallestPair;
			}
			if (current <= smallest) {
				smallest=current;
				smallestPair[0] = firstNum;
				smallestPair[1] = secondNum;
			}
			
		}
    return smallestPair;
  }