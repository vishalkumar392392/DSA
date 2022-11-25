package com.geeks.recursion;

public class SubsetSum {

	public static void main(String[] args) {

//		int arr[] = { 10, 20, 15 };
		int arr[] = { 10, 5, 2, 3, 6 };

		System.out.println(countSubSets(arr, arr.length, 8));
		System.out.println(isSubSetSum(arr, arr.length, 8));

	}

	public static int countSubSets(int arr[], int n, int sum) {

		if (n == 0)
			return sum == 0 ? 1 : 0;

		return countSubSets(arr, n - 1, sum) + countSubSets(arr, n - 1, sum - arr[n - 1]);
	}

	public static boolean isSubSetSum(int arr[], int n, int sum) {
		if (n == 0)
			return sum == 0 ? true : false;

		return isSubSetSum(arr, n - 1, sum) || isSubSetSum(arr, n - 1, sum - arr[n - 1]);
	}

}
