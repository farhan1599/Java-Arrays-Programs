package com.practice.arrays;

import java.util.HashSet;

public class UnionOfArray {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = {};

		// findUnionUsingSet(arr1, arr2);
		findUnion(arr1, arr2);
	}

	private static void findUnionUsingSet(int[] arr1, int[] arr2) {

		/*
		 * 1.create a set object 2.add the array1 element to the set object 3.add the
		 * array2 element to the set object 4.copy the elements from set object to
		 * array3 5.print array3 element
		 */

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr1) {
			set.add(num);
		}

		for (int num : arr2) {
			set.add(num);
		}

		int[] arr3 = new int[set.size()];

		int index = 0;
		for (int n : set) {
			arr3[index] = n;
			index++;
		}

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

	// finding union to two arrays without Set object

	private static void findUnion(int[] arr1, int[] arr2) {

		// Step 1: Combine arrays
		int[] combined = new int[arr1.length + arr2.length];

		int index = 0;

		for (int i = 0; i < arr1.length; i++) {
			combined[index++] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			combined[index++] = arr2[i];
		}

		// Step 2: Sort the combined array
		for (int i = 0; i < combined.length - 1; i++) {

			for (int j = i + 1; j < combined.length; j++) {
				if (combined[i] > combined[j]) {

					int temp = combined[i];
					combined[i] = combined[j];
					combined[j] = temp;
				}
			}
		}

		int i = 0;
		for (int j = 1; j < combined.length; j++) {
			if (combined[i] != combined[j])
				i++;
			combined[i] = combined[j];

		}

		System.out.println("\nUnion of two array : ");
		for (int k = 0; k <= i; k++) {
			System.out.print(combined[k] + " ");
		}

	}

}
