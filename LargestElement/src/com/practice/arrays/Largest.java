
package com.practice.arrays;

public class Largest {

	public static void main(String[] args) {

		int[] arr = { 23, 34, 54, 33, 43 };

		findMax(arr);
	}

	private static void findMax(int[] arr) {

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element is :"+largest);

	}

}
