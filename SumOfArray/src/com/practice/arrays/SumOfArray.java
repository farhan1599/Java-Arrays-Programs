package com.practice.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element at index :" + i);
			arr[i] = sc.nextInt();
		}
		sc.close();
		calculateSum(arr);
	}

	private static void calculateSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The sum of the array is :" + sum);
	}

}
