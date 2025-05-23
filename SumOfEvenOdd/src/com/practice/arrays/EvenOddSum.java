package com.practice.arrays;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int size = sc.nextInt();

		// declare an array
		int[] arr = new int[size];

		// take the elements into an array
		for (int i = 0; i < size; i++) {

			System.out.println("Enter element at index :" + i);
			arr[i] = sc.nextInt();
		}

		findEvenOdd(arr);

	}

	private static void findEvenOdd(int[] arr) {

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}

		System.out.println("Even sum =" + evenSum);
		System.out.println("Odd sum=" + oddSum);

	}
}
