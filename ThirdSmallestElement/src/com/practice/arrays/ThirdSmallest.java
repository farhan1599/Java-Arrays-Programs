package com.practice.arrays;

public class ThirdSmallest {

	public static void main(String[] args) {

		int[] arr = { 12, 23, 12, 34, 32, 12, 34, 45, 2, 2, 12, 23, 1, -1, -2, 65, 45, 43, 32, 45 };

		findThirdMin(arr);
	}

	/*first sort the array(desc) then remove duplicates from the sorted array,
	 * then print the lastIndex-3*/
	private static void findThirdMin(int[] arr) {

		System.out.println("Elements before :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sort(arr);

//		System.out.println("\nElements after sorting :");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// removing duplicates
		int i = 0;
		for (int j = 1; j < arr.length; j++) {

			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}

//		System.out.println("\nElements after removing duplicates :");
//		for (int k = 0; k <= i; k++) {
//			System.out.print(arr[k] + " ");
//		}

		int newLength = i + 1;

		if (newLength >= 3) {
            System.out.println("\nThird smallest: " + arr[2]);
        } else {
            System.out.println("\nLess than 3 distinct elements.");
        }

	// method for sorting
	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
