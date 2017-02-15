package com.core.algo.practice;

public class ShellSort {
	
	public static void sort(int[] a){
		int n = a.length;
		int h = 0;
		while(h<n){
			h = 3*h+1;
		}
		h = h/3;
		
		while(h > 0){
			for(int i = 0; i< n; i++){
				for(int j = i; j >= h; j=j-h){
					if(a[j] < a[j-h]){
						InsertionSort.swap(a, j-h, j);
					} else {
						break;
					}
				}
			}
			h = h/3;
		}
	}
}
