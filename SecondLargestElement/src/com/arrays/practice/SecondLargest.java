package com.arrays.practice;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 23, 23, 23, 23, 34, 12, 54, 53, 53, 55, 54 };

		findSecondMax(arr);
	}

//==============================without sorting=========================================
	private static void findSecondMax(int[] arr) {
		int largest = arr[0];
		int second_largest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];

			} else if (arr[i] != largest && arr[i] > second_largest) {
				second_largest = arr[i];
			}
		}
		System.out.println("Second large number is :" + second_largest);

	}

}
