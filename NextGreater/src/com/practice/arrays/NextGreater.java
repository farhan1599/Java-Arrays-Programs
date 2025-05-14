package com.practice.arrays;

public class NextGreater {

	// print the element if its next element is greater.

	public static void main(String[] args) {
	
		int[] arr = {3,2,6,4,7,8,1,0};
		
		isNextGreater(arr);

	}

	private static void isNextGreater(int[] arr) {
		
		for(int i = 0; i<arr.length-1;i++) {
			
			if(arr[i] < arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
