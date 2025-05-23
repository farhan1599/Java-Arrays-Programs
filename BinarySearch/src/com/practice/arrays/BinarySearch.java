package com.practice.arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 23, 55, 21, 43, 34 };

		int key = 34; // element to search

		int index = searchElement(arr, key);

		if (index != -1) {
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element not found..!");
		}
	}

	private static int searchElement(int[] arr, int key) {

		// first sort the array

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {

				start = mid + 1;

			} else {
				end = mid - 1;
			}
		}

		return -1;

	}

}