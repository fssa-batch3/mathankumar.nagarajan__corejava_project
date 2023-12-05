package day11.misc;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {2,5,7,8,9,4,1,3};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static int pivot(int[] arr,int start, int end) {
		
		int pIndex = start;
		int pivot = arr[end];
		
		for(int i=start; i<end; i++) {
			
			if(arr[i] <= pivot) {
				
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
				
			}
			
		}
		int temp2 = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp2;
		
		return pIndex;
		
	}
	
	static void sort(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int pivot = pivot(arr, start, end);
			sort(arr, start, pivot-1);
			sort(arr, pivot+1, end);
			
		}
		
	}

}
