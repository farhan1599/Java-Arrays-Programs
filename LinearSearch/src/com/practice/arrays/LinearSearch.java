package com.practice.arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 23, 12, 34, 54, 56 };

		int key = 34; // element to search

		int index = searchElement(arr, key);

		if (index != -1) {
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element not found.!");
		}
	}

	private static int searchElement(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {

				return i;
			}
		}

		return -1;
	}

}
