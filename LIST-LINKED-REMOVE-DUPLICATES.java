class Program {
  public static int getNthFib(int n) {
	int[] arr = new int[n];
	arr[0]= 0;
	if (n>1)
		arr[1]= 1;
	int total =1;
	int i;
    for (i = 2; i < n; i++) {
		arr[i] = arr[i-1] + arr[i-2];
    }
	for (i = 0; i < n; i++) {
		System.out.println (arr[i]);
    }
    return arr[i-1];
  }
  
	public static int recurFib(int n) {
		if(n == 0 || n == 1)
			return 0;
		if( n == 2)
			return 1;
		return recurFib(n-2) + recurFib(n-1);
  } 
}