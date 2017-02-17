package com.core.algo.practice;

public class QuickSelect {

	public static int select(int[] a, int k) {
		SortHelper.print(a);
		int kPos = k - 1;
		int lo = 0;
		int hi = a.length - 1;
		while (lo < hi) {
			int p = QuickSort.partition(a, lo, hi);
			if (kPos < p)
				hi = p - 1;
			else if (kPos > p)
				lo = p + 1;
			else
				return a[kPos];
		}
		return a[lo];
	}

}
