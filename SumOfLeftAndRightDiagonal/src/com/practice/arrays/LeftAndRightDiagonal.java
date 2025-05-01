package com.practice.arrays;

import java.util.Scanner;

public class LeftAndRightDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter the elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = sc.nextInt();
			}
		}

		leftAndRightDiagonalSum(matrix);
	}

	private static void leftAndRightDiagonalSum(int[][] matrix) {

		// printing the matrix
		System.out.println("Elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// calculating left and right diagonal sum

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (i == j) {
					leftSum = leftSum + matrix[i][j];
				}

				if (i + j == matrix.length - 1) {
					rightSum = rightSum + matrix[i][j];
				}
			}
		}

		System.out.println("Sum of left diagonal : " + leftSum);
		System.out.println("Sum of right diagonal : " + rightSum);

	}

}
