package com.core.algo.practice;

public class InsertionSort {

	public static void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					SortHelper.swap(a, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	
	
}
