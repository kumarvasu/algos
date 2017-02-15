package com.core.algo.practice;

public class BottomUpMerge {

	public static void sort(int[] a) {
		int aux[] = new int[a.length];
		int N = a.length;
		for (int sz = 1; sz < N; sz += sz) {
			for (int lo = 0; lo < N - sz; lo += (sz + sz)) {
				MergeSort.merge(a, aux, lo, lo + sz - 1, Math.min(N - 1, lo + sz + sz - 1));
			}
		}
	}

}
