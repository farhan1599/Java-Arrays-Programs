package com.pactice.arrays;

public class ThirdLargest {

	public static void main(String[] args) {

		int[] arr = { 23, 1, 0, 23, 45, 76, 23, 45};

		findThirdMax(arr);

	}

	/*first sort the array(asc) then remove duplicates from the sorted array,
	 * then print the lastIndex-3*/
	private static void findThirdMax(int[] arr) {

//		System.out.println("Before sorting and removing duplicates  : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(+arr[i] + " ");
//		}
		
		
		
		// sorting the array
		int[] sortedArr =sort(arr);
				          

//		System.out.println("\nafter sorting : ");
//		for (int i = 0; i < sortedArr.length; i++) {
//			System.out.print(sortedArr[i] + " ");
//		}

		// removing duplicates
		int i = 0;
		for (int j = 1; j < sortedArr.length; j++) {
			if (sortedArr[i] != sortedArr[j]) {
				i++;
				sortedArr[i] = sortedArr[j];
			}
		}
		// display the elements from index 0 to i
		
//		System.out.println("\nafter removing duplicates : ");
//		for (int k = 0; k <= i; k++) {
//			System.out.print(sortedArr[k] + " ");
//		}

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
}
