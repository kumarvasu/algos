package com.core.algo.practice;

public class MergeSort {
	
	public static void merge(int[] a, int[] aux, int low, int mid, int high){
		for(int k = low; k <= high; k++){
			aux[k] = a[k];
		}
		
		int i = low, j = mid+1;
		
		for(int k = low; k <= high; k++){
			if(i > mid) 
				a[k] = aux[j++];
			else if(j > high)
				a[k] = aux[i++];
			else if(aux[i] < aux[j])
				a[k] = aux[i++];
			else
				a[k] = aux[j++];
		}
	}
	
	private static void sort(int[] a, int[] aux, int low, int high){
		if(low >= high) return;
		int mid = low + (high-low)/2;
		sort(a, aux, low, mid);
		sort(a, aux, mid+1, high);
		merge(a, aux, low, mid, high);
	}
	
	public static void sort(int[] a){
		int[] aux = new int[a.length];
		sort(a, aux, 0, a.length-1);
	}

}
