package com.practice.arrays;

import java.util.Scanner;

public class LeftDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter the elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = sc.nextInt();
			}
		}

		leftDiagonaSum(matrix);

	}

	private static void leftDiagonaSum(int[][] matrix) {

		// printing the matrix
		System.out.println("Elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// calculating left diagonal sum
		int leftSum = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (i == j) {
					leftSum = leftSum + matrix[i][j];
				}

			}
		}
		System.out.println("Sum of left diagonal : " + leftSum);

	}

}
