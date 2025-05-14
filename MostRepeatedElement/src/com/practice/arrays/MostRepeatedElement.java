package com.practice.arrays;

public class MostRepeatedElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 4, 1, 5, 4, 3 };

		findMostRepeated(arr);

	}

	private static void findMostRepeated(int[] arr) {

		int maxCount = 0;
		int mostRepeated = arr[0];

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (visited[i]) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}

			}

			if (count > maxCount) {
				maxCount = count;
				mostRepeated = arr[i];
			}

		}

		System.out.println("Most frequent element is: " + mostRepeated + " (occurs " + maxCount + " times)");
	}

}
