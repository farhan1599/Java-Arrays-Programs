package com.practice.arrays;

public class EqualOrNot {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 7, 4, 6 };
		int[] arr2 = { 2, 3, 7, 4, 6 };

		boolean isEqual = areArraysEqual(arr1, arr2);
		
		if(isEqual) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Both arrays are not equal");
		}

	}

	private static boolean areArraysEqual(int[] arr1, int[] arr2) {

		// Step 1: Check length
		if (arr1.length != arr2.length) {
			return false;
		}

		// Step 2: Check element by element
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;

	}

}
