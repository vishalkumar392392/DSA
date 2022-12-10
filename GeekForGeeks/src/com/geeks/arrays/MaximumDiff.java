package com.geeks.arrays;

public class MaximumDiff {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		int arr1[] = { 7, 9, 5, 6, 3, 2 };
		int arr2[] = { 10, 20, 30 };
		int arr3[] = { 30, 10, 8, 2 };

		System.out.println(maximumDifference(arr3));
		System.out.println(maximumDifference2(arr3));
		System.out.println(maxDifferenceEfficient(arr3));


	}

	// Brute force O(N^2)
	public static int maximumDifference(int arr[]) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (max < diff) {
					max = diff;
				}
			}
		}

		return max;
	}

	// TC -> O(N)
	// Best solution
	public static int maxDifferenceEfficient(int arr[]) {

		int res = arr[1] - arr[0];
		int minVal = arr[0];

		for (int j = 1; j < arr.length; j++) {
			res = Math.max(res, arr[j] - minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		return res;
	}

	// TC -> O(N)
	// This approach wont work when maximum element in the array present at 0th
	// index.
	public static int maximumDifference2(int arr[]) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int minIndex = Integer.MIN_VALUE;
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}

			if (arr[i] < min && i <= maxIndex) {
				min = arr[i];
				minIndex = i;
			}
		}

		return max - arr[minIndex];
	}

}
