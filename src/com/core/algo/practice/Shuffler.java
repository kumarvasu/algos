package com.core.algo.practice;

import java.util.Random;

public class Shuffler {

	public static void shuffle(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = rand.nextInt(i + 1);
			InsertionSort.swap(a, i, r);
		}
	}

}
