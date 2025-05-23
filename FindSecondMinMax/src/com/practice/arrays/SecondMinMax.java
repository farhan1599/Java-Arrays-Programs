package com.practice.arrays;

public class SecondMinMax {

	public static void main(String[] args) {

		int[] arr = {23, 12, 43, 65, 32 };

		findSecondMinMax(arr);
	}

	private static void findSecondMinMax(int[] arr) {

		int max = arr[0];
		int min = arr[0];

		// find min max
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// find secondMin secondMax
		int secondMin = max;
		int secondMax = min;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > min && arr[i] < secondMin) {
				secondMin = arr[i];
			}

			if (arr[i] < max && arr[i] > secondMax) {

				secondMax = arr[i];
			}

		}

		System.out.println("Second min : " + secondMin);
		System.out.println("Second max : " + secondMax);

	}

}
