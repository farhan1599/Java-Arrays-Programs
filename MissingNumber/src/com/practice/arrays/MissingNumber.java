package com.practice.arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = {1,3,6,4,8,7};
		findMissingNumbers(arr);
	}

	private static void findMissingNumbers(int[] arr) {

		// Step 1: Sort the array
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//print the sorted array
		System.out.println("Array after sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

		// Step 2: Find min and max in the array
		int min = arr[0];
		int max = arr[arr.length - 1];

		// Step 3: Print missing numbers in range [min, max]
		System.out.println("\nMissing numbers are : ");
		for (int i = min; i <= max; i++) {

			boolean found = false;

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == i) {
					found = true;
					break;
				}
			}
			if (found == false) {
				
			
				System.out.print(i+" ");

			}
			
			}
		

	}

}
