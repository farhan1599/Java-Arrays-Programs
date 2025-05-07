package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedMerge {

	/* program to merge two sorted arrays into a single sorted array. */

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 4, 4, 5 };
		int[] arr2 = { 6, 7, 8, 8, 9 };

		// mergeAndSortUsingCollections(arr1, arr2);
		mergeAndSort(arr1, arr2);
	}

	private static void mergeAndSort(int[] arr1, int[] arr2) {

		int[] merged = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		// Merge two arrays
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];

			} else {
				merged[k++] = arr2[j++];
			}

		}

		// Copy remaining elements of arr1

		while (i < arr1.length) {
			merged[k++] = arr1[i++];
		}

		// Copy remaining elements of arr2

		while (j < arr2.length) {
			merged[k++] = arr2[j++];
		}

		// Print merged array
		System.out.println("Merged and sorted array : ");
		for (int num : merged) {
			System.out.print(num + " ");
		}

	}

	private static void mergeAndSortUsingCollections(int[] arr1, int[] arr2) {

		// create a list object and both array into the list
		List<Integer> lst = new ArrayList<>();

		for (int num : arr1) {
			lst.add(num);
		}

		for (int num : arr2) {
			lst.add(num);
		}

		// sort the list
		Collections.sort(lst);

		// print the list
		System.out.println("Merged and sorted array : ");
		for (int num : lst) {
			System.out.print(num + " ");
		}
	}

}
