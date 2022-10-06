package com.backtracing;

public class SubSetsOfArray {

	public static void main(String[] args) {

		int arr[] = { 2, 5, -6, 8, 9, 24, -3 };
		System.out.println(subset(arr, arr.length, 7, 0, 0));

	}

	public static boolean subset(int arr[], int n, int k, int sum, int index) {

		if (index == n)
			return sum == k;

		return subset(arr, n, k, sum + arr[index], index + 1) || subset(arr, n, k, sum, index + 1);

	}

}
