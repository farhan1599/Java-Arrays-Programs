package com.practice.arrays;

public class ProductOfMatrix {

	/*
	 * Rule : If the number of cols in the first matrix and the number of rows in
	 * the second matrix are equal then we can multiply the two matrices.
	 */
	public static void main(String[] args) {

		int[][] matrix1 = { { 2, 3 }, { 3, 2 } };
		int[][] matrix2 = { { 2, 1, 3 }, { 3, 1, 2 } };

		multiplyTwoMatrices(matrix1, matrix2);
	}

	private static void multiplyTwoMatrices(int[][] matrix1, int[][] matrix2) {

		int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix3[i][j] = 0;
				for (int k = 0; k < matrix2.length; k++) {
					matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// print the elements of matrix1
		System.out.println("Elements of matrix 1 :");
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		// print the elements of matrix2
		System.out.println("Elements of matrix 2 :");
		for (int i = 0; i < matrix2.length; i++) {

			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		// print the elements of matrix3
		System.out.println("Multiplication of matrix 1 and matrix 2 :");
		for (int i = 0; i < matrix3.length; i++) {

			for (int j = 0; j < matrix3[0].length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
