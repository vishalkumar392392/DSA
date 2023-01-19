package com.geeks.arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
//		int arr[] = {5,8,3};
//		int arr[] = { -6,-1,-8};
//		int arr[] = { 1, -2, 3, -1 };
//		int arr[] = { -1, 7, -1, 2 };
		System.out.println(maxSubArraySum(arr));
		System.out.println(authorSolution(arr));

	}

	// TC -> 0(N^2)
	public static int maxSubArraySum(int arr[]) {

		int res = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int prevoiusCount = 0;
			for (int j = i; j < arr.length; j++) {
				res = Math.max(res, (prevoiusCount + arr[j]));
				prevoiusCount = prevoiusCount + arr[j];
			}
		}
		return res;
	}

	// TC -> 0(N)
	// SC -> 0(N)
	public static int authorSolution(int arr[]) {

		int max = arr[0];
		int auxArry[] = new int[arr.length];
		
		auxArry[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			auxArry[i] = Math.max(auxArry[i - 1] + arr[i], arr[i]);
			max = Math.max(max, auxArry[i]);
		}
		return max;
	}

}
