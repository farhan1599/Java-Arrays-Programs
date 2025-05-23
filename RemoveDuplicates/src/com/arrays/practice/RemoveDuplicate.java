package com.arrays.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 11, 11, 100, 121, 100, 2, 3, 2, 1, 1 };

		// removeDuplicateElementsUsingSet(arr);
		removeDuplicateElements(arr);
	}

	// Solution 1:
	/*
	 * Create a Set object, add array element to the Set object, store the element
	 * from the Set object back to another array
	 */
	private static void removeDuplicateElementsUsingSet(int[] arr) {
		
		System.out.println("\nBefore removing :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Set<Integer> set = new TreeSet<>(); //if you want sorted output
		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);

		}

		System.out.println("\nAfter removing :");
		for (int num : set) {
			System.out.print(num + " ");

		}
	}

	// Solution 2:
	/*
	 * Sort the array, compare the current element with next element, if matched
	 * then its a duplicate element, so remove it
	 */
	private static void removeDuplicateElements(int[] arr) {

		System.out.println("Before removing duplicates :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// sorting the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		// removing duplicates
		int index = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[index] != arr[j]) {
				index++;
				arr[index] = arr[j];
			}
		}

		// after removing duplicates display element till index
		System.out.println("\nAfter removing duplicates :");
		for (int i = 0; i <= index; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
