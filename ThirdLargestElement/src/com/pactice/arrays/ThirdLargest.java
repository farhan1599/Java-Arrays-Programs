package com.pactice.arrays;

public class ThirdLargest {

	public static void main(String[] args) {

		int[] arr = { 23, 1, 0, 23, 45, 76, 23, 45 };

		//findThirdMax(arr);
		findThirdLargest(arr);

	}

	/*
	 * first sort the array(asc) then remove duplicates from the sorted array, then
	 * print the lastIndex-3
	 */
	private static void findThirdMax(int[] arr) {



		// sorting the array
		int[] sortedArr = sort(arr);

		// removing duplicates
		int i = 0;
		for (int j = 1; j < sortedArr.length; j++) {
			if (sortedArr[i] != sortedArr[j]) {
				i++;
				sortedArr[i] = sortedArr[j];
			}
		}
		
		int newLength = i + 1;
		// Print third largest (which is third last in sorted unique list)
		if (newLength >= 3) {
			System.out.println("\nThird largest element is : " + sortedArr[newLength - 3]);
		} else {
			System.out.println("\nSorry less than 3 distinct elements...!");
		}
	}

	// method for sorting the array
	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}

//find the third largest element in the array in O(N) time complexity

	private static void findThirdLargest(int[] arr) {

		Integer first = null, second = null, third = null;

		for (int num : arr) {

			// Skip duplicates
			if ((first != null && num == first) || (second != null && num == second)
					|| (third != null && num == third)) {
				continue;
			}
			
			
			if(first == null || num > first) {
				third = second;
				second = first;
				first = num;
			}
			else if(second == null || num > second) {
				third = second;
				second = num;
			}
			else if(third == null || num > third) {
				third = num;
			}
		}
		
		if(third != null) {
			System.out.println("Third largest element is : "+third);
		}
		else {
			System.out.println("Less than 3 distinct element");
		}

	}

}
