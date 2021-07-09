public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }//split into 2
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
}

public static void merge(
  int[] sorted, int[] l, int[] r, int left, int right) {
    int le = 0, ri = 0, sor = 0;
	// minimum element will be placed in sorted sub array
    while (le < left && ri < right) {
        if (l[le] <= r[ri]) {
            sorted[sor++] = l[le++];
        }
        else {
            sorted[sor++] = r[ri++];
        }
    }
	// copy remaining elements of left sub array into the merged array
    while (le < left) {
        sorted[sor++] = l[le++];
    }
	//copy remaining elements of right sub array into the merged array
    while (ri < right) {
        sorted[sor++] = r[ri++];
    }
}













SORT-MERGE