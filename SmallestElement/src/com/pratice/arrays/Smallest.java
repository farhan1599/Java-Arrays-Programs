package com.pratice.arrays;

public class Smallest {

	public static void main(String[] args) {

		int[] arr = { 23, 12, 32, 43, 34 };

		findMin(arr);
	}

	private static void findMin(int[] arr) {

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Element is :"+smallest);

	}

}
