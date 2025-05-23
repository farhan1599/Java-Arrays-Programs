package com.practice.arrays;

import java.util.Scanner;

public class SumOfMatrix {

	/*
	 * Rule: both matrices should contain same no of rows and columns. If matrix1
	 * has 2 rows, 3 cols and matrix2 has 2 rows, 3 cols then addition is possible
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows :");
		int rows = sc.nextInt();

		System.out.println("Enter the number of cols :");
		int cols = sc.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];

		System.out.println("Enter the element for matrix 1 :");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the element for matrix 2 :");
		for (int i = 0; i < matrix2.length; i++) {

			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		addTwoMatrices(matrix1, matrix2);
	}

	private static void addTwoMatrices(int[][] matrix1, int[][] matrix2) {

		int[][] matrix3 = new int[matrix1.length][matrix1[0].length];

		for (int i = 0; i < matrix3.length; i++) {

			for (int j = 0; j < matrix3[0].length; j++) {

				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// display the elements of matrix1
		System.out.println("Elements of matrix 1 :");
		for (int i = 0; i < matrix1.length; i++) {

			for (int j = 0; j < matrix1[0].length; j++) {

				System.out.print(matrix1[i][j] + " ");

			}
			System.out.println();
		}

		// display the elements of matrix2
		System.out.println("Elements of matrix 2 :");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}

			System.out.println();
		}

		// display the elements of matrix3 = (matrix1 + matrix2)
		System.out.println("Addition of matrix 1 and matrix 2 :");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[0].length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
