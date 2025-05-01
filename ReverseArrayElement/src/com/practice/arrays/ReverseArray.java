package com.practice.arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 23, 43, 12, 32, 56 };

		reverse(arr);
	}

	private static void reverse(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

//		for (int num : arr) {
//			System.out.print(num + " ");
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
