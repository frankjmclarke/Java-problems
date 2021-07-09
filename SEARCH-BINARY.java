import java.util.*;

public static int binarySearch(int[] array, int target) {
	int len = array.length;
	int index;
	int right = len-1;
	int left = 0;
	while (left <= right) {
		index = (left + right) / 2;
		if (array[index] == target) return index;
		if (array[index] > target)
			right = index - 1;
		else
			left = index + 1;	
	}
	return -1;
}

static int search(int[] array, int target, int left, int right){
	if (left > right) return -1;
	
	int mid = (left + right) /2;
	if (array[mid] == target) return mid;
	
	if (array[mid] > target)
		return search(array, target, left, mid - 1);
	else
		return search(array, target, mid + 1,right);		
}
public static int binarySearch(int[] array, int target) {
	return search(array, target, 0, array.length - 1);
}