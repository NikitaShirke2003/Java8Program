package com.csi.jdkfeatures;

import java.util.Arrays;

public class ParallelSortEx {
	
	public static void main(String[] args) {
		
		int arr[]= {3,1,6,4, };
         
		System.out.println("\n Before Sort:");
		
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("\nAfter Sort:");
		
		Arrays.parallelSort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
