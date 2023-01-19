package com.geeks.arrays;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 1, 1, 0, 1, 1 };
		int arr1[] = { 1, 1, 1, 1 };
		int arr2[] = { 0, 0, 0 };
		int arr3[] = { 0, 1, 1, 0, 1, 0 };
		System.out.println(maxConsecutiveOnes(arr3));
		System.out.println(authorSolution(arr3));

	}

	// TC -> 0(N)
	public static int maxConsecutiveOnes(int arr[]) {

		int prevoiusCount = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
				count++;
			} else {
				prevoiusCount = Math.max(count, prevoiusCount);
				count = 0;
			}
			prevoiusCount = Math.max(count, prevoiusCount);
		}

		return prevoiusCount;
	}

	// TC -> 0(N)
	public static int authorSolution(int arr[]) {

		int res = 0;
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				curr = 0;
			} else {
				curr++;
				res = Math.max(res, curr);
			}
		}
		return res;
	}

}
