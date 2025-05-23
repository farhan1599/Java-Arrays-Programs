package com.practice.arrays;

import java.util.Scanner;

public class RightDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter the elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = sc.nextInt();
			}
		}

		rightDiagonaSum(matrix);

	}

	private static void rightDiagonaSum(int[][] matrix) {

		// printing the matrix
		System.out.println("Elements of matrix :");

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// calculating right diagonal sum
		int rightSum = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (i + j == matrix.length - 1) {
					rightSum = rightSum + matrix[i][j];
				}

			}
		}
		System.out.println("Sum of right diagonal : " + rightSum);

	}

}
