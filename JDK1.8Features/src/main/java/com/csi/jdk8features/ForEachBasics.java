package com.csi.jdk8features;

import java.util.Arrays;

public class ForEachBasics {

	public static void main(String[] args) {

		int arr[] = { 7 ,8, 4, 2, 1 };
		
		//Arrays.sort(arr);
		Arrays.parallelSort(arr);  //In Java 8
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
