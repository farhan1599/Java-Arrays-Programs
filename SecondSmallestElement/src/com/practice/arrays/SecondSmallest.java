package com.practice.arrays;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] arr = { 23, 34, 54, 12, 45 };

		findSecondMin(arr);
	}

	//==============================without sorting=========================================
	private static void findSecondMin(int[] arr) {

		int smallest = arr[0];
		int second_smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if(arr[i]<smallest) {
				second_smallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i] != smallest && arr[i]<second_smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Second smallest element is : "+second_smallest);

	}

}
