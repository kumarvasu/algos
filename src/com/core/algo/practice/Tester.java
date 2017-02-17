package com.core.algo.practice;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class Tester {

	
	public static void main(String[] args){
		int[] a = {3,5,2,4,1};
		int[] b = {3,5,2,4,1};
		int[] c = {3,5,2,4,1};
		InsertionSort.sort(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println("");
		SelectionSort.sort(b);
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println("");
		ShellSort.sort(c);
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]+" ");
		System.out.println("");
		
		Shuffler.shuffle(c);
		Shuffler.shuffle(b);
		Shuffler.shuffle(a);
		
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]+" ");
		System.out.println("");
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println("");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println("");

		
		MergeSort.sort(c);
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]+" ");
		System.out.println("");

		BottomUpMerge.sort(b);
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println("");
		
		QuickSort.sort(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println("");

		Shuffler.shuffle(a);
		int k = 1;
		System.out.println(k +"- element: " + QuickSelect.select(a, k));
		k = a.length;
		System.out.println(k +"- element: " + QuickSelect.select(a, k));
		k = a.length/2;
		System.out.println(k +"- element: " + QuickSelect.select(a, k));
		
		
		int[] d = {2,4,1,3,2,2,1,5};
		ThreeWayQuickSort.sort(d);
		SortHelper.print(d);
	}
}
