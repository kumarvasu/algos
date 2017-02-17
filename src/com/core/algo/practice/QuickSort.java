package com.core.algo.practice;

public class QuickSort {

	public static int partition(int[] a, int lo, int hi) {
		int p = lo;
		int i = lo + 1, j = hi;
		while (true) {
			while (a[i] < a[p]) {
			if (i == hi)
				break;
			i++;
			}

			while (a[j] > a[p]) {
			if (j == lo)
				break;
			j--;
			}
			
			if (i >= j)
				break;
			SortHelper.swap(a, i++, j--);
		}
		SortHelper.swap(a, j, p);
		return j;
	}

	public static void sort(int a[], int lo, int hi) {
		//if (hi <= lo)
		if(lo >= hi)
			return;
		int p = partition(a, lo, hi);
		sort(a, lo, p - 1);
		sort(a, p + 1, hi);
	}

	public static void sort(int a[]) {
		Shuffler.shuffle(a);
		sort(a, 0, a.length - 1);
	}

}
