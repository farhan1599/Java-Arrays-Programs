package com.practice.arrays;

public class Sort {

	public static void main(String[] args) {

		int[] arr = { 23, 45, 12, 56, 78,34,56,34};

		//sortTheArray(arr);
		findThirdLargest(arr);
	}
	
	
	 private static void findThirdLargest(int[] arr) {
	        Integer first = null, second = null, third = null;

	        for (int num : arr) {
	            // Skip duplicates
	            if ((first != null && num == first) ||
	                (second != null && num == second) ||
	                (third != null && num == third)) {
	                continue;
	            }

	            if (first == null || num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (second == null || num > second) {
	                third = second;
	                second = num;
	            } else if (third == null || num > third) {
	                third = num;
	            }
	        }

	        if (third != null) {
	            System.out.println("Third largest distinct element is: " + third);
	        } else {
	            System.out.println("Less than 3 distinct elements.");
	        }
	    }

	private static void sortTheArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) { 

					int temp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for(int i = 0; i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
