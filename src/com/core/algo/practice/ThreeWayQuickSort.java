package com.core.algo.practice;

public class ThreeWayQuickSort {

	public static void sort(int[] a, int lo, int hi) {
		if(lo >= hi)
			return;
		int i = lo, j = hi, lt = lo;
		while (i < j) {
			if (a[i] > a[lt]) {
				SortHelper.swap(a, i, j--);
			} else if (a[i] < a[lt]) {
				SortHelper.swap(a, lt++, i++);
			} else {
				i++;
			}
		}
		sort(a, lo, lt - 1);
		sort(a, j + 1, hi);
	}

	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

}
