package com.array.problem;

public class WhoWonElection {

	public static void main(String[] args) {
		int arr[] = { 8, 10, 10, 4, 3, 3, 3, 2, 4, 3, 8, 10, 10, 10, 10 };
		solutionOne(arr);
		solutionTwo(arr);
		solutionThree(arr);
	}

	/** Time and space complexity is N^2, 1 */
	public static void solutionOne(int arr[]) {

		int candidate = 0;
		int maxCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (maxCount < count) {
				candidate = arr[i];
				maxCount = count;
			}
		}
		System.out.println("Solution 1");
		System.out.println("candidate " + candidate);
		System.out.println("votes he got " + maxCount);
		System.out.println("===================================");

	}

	/** Time and space complexity is 10*N, 1 */
	public static void solutionTwo(int arr[]) {
		int candidate = 0;
		int maxCount = 0;
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
				if (maxCount < count) {
					candidate = arr[j];
					maxCount = count;
				}
			}
		}
		System.out.println("Solution 2");
		System.out.println("candidate " + candidate);
		System.out.println("votes he got " + maxCount);
		System.out.println("===================================");

	}

	/** Time and space complexity is N+10, 10 */
	public static void solutionThree(int arr[]) {

		int count[] = new int[11];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		int maxIndexValue = 0;
		for (int i = 0; i < count.length; i++) {
			if (maxIndexValue < count[i]) {
				maxIndexValue = i;
			}
		}
		System.out.println("Solution 3");
		System.out.println("candidate " + maxIndexValue);
		System.out.println("votes he got " + count[maxIndexValue]);
		System.out.println("===================================");

	}

}
