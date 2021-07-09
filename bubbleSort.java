import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
  
  //Arrays.sort(arr, Collections.reverseOrder());
  public static void main(String args[]) throws IOException {
    
    int[] unsorted={0,9,8,7,6,5,4,9};

    int[] sorted=bubbleSort(unsorted);
    int limit = sorted.length -1;
    for (int i = 0; i<limit; i++)
      System.out.print(sorted[i]+", ");
  } 
  
   static int[] bubbleSort(int[] array) {
    for (int i = 0; i < array.length ; i++) {
			for (int j= 0; j< (array.length-i)-1; j++) {
				if (array[j]> array[j+1]) {	
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;					
				}
			}
		}
    return array;
  }
  
	static void swap (int i, int j , int[]arr) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;	
	}	
	static int[] insertionSort(int[] array) {
		if (array.length==0) return new int[]{};
		for (int i=1; i< array.length;i++){
			int j = i;
			while(j > 0 && array[j]< array[j-1]){
				swap (j, j-1, array);
				j--;
			}
		}
		return array;
	}

 static void mergeSort(int[] arr, int n) {
    if (n < 2) 
        return;
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
    for (int i = 0; i < mid; i++)
        l[i] = arr[i];
    for (int i = mid; i < n; i++)
        r[i - mid] = arr[i];//start with 2
    mergeSort(l, mid);//keep splitting
    mergeSort(r, n - mid);//finally merge
    merge(arr, l, r, mid, n - mid);
}

 static void merge( // 2 finger
  int[] sorted, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j])
            sorted[k++] = l[i++];
        else {
            sorted[k++] = r[j++];
    }
    while (i < left)
        sorted[k++] = l[i++];
    while (j < right)
        sorted[k++] = r[j++];
}	
 
public static void selectionSort(int[] arr){  //T O(N^2) Space O(1)
	for (int i = 0; i < arr.length - 1; i++) {  
		int index = i;  
		for (int j = i + 1; j < arr.length; j++){  
			if (arr[j] < arr[index]){  
				index = j;//searching for lowest index  
			}  
		}  
		int smallerNumber = arr[index];   
		arr[index] = arr[i];//move to sorted section  
		arr[i] = smallerNumber;  
	}
}     
  
  static void linkedSort(LinkedList list) {
    Node i = list.head;    
    while ( i!= null){
      Node j = list.head;
      while (j.next != null){
        if (j.data > j.next.data) {
          int temp = j.data;
          j.data=j.next.data;
          j.next.data = temp;
        }
        j=j.next;
      }
      i=i.next;
    }    
  }
  
}