package com.practice.arrays;

public class RightSideGreater {

	/* prints the element which has greater element on right side */

	public static void main(String[] args) {

		int[] arr = { 10, 4, 6, 3, 5, 2 };

		isRightGreater(arr);

	}

	private static void isRightGreater(int[] arr) {

		int n = arr.length;
		int rightMax = arr[n - 1];

		System.out.println("Elements whose right side has a greater value:");

		for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < rightMax) {
                System.out.print(arr[i] + " ");
            } else {
            	rightMax = arr[i];
            }
        }
	}

}
