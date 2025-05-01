package com.practice.arrays;

public class Frequency {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 2, 3, 1, 2, 4, 1, 3 };

		frequencyOfEachElement(arr);
	}

	private static void frequencyOfEachElement(int[] arr) {

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
			System.out.println(arr[i] + " occurs " + count + " times");
		}

	}

}
