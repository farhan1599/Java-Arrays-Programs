package com.practice.arrays;

public class MaxSubarraySum {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 2, 5, 6, -9, 6 };

		findMaxSubarraySum(arr);

	}

	private static void findMaxSubarraySum(int[] arr) {

		int currentSum = 0;
		int maxSum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}

			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		System.out.println("Max subarray sum is : "+maxSum);

//==================if you want to print actual subarray also=============================

//		int currentSum = 0;
//		int start = 0;
//		int end = 0;
//		int temp = 0;
//		int maxSum = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			currentSum = currentSum + arr[i];
//
//			if (currentSum > maxSum) {
//				maxSum = currentSum;
//				start = temp;
//				end = i;
//			}
//
//			if (currentSum < 0) {
//				currentSum = 0;
//				temp = i + 1;
//			}
//		}
//		System.out.println("Max subarray sum is: " + maxSum);
//		System.out.print("Subarray with max sum :");
//		for (int i = start; i <= end; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

}
