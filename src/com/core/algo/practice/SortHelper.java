package com.core.algo.practice;

public class SortHelper {

	public static void swap(int[] a, int i , int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void print(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
}
