package com.core.algo.practice;

public class SelectionSort {
	
	public static void sort(int[] a){
		int n = a.length;
		for(int i = 0; i<n; i++){
			int min = i;
			for(int j = i+1; j < n; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			InsertionSort.swap(a, i, min);
		}
	}

}
