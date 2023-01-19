package com.geeks.arrays;

public class MaxLengthEvenOddSubArray {

	public static void main(String[] args) {
		int arr[] = { 10, 12, 14, 7, 8 };
//		int arr[] = { 7, 10, 13, 14 };
//		int arr[] = { 10, 12, 8, 4 };
//		int arr[] = { 5, 10, 20, 63, 8 };

		System.out.println(maxLength(arr));
	}

	// TC -> 0(N)
	public static int maxLength(int arr[]) {

		int res = 1;
		int previousEle = arr[0];
		int max = 1;

		for (int i = 1; i < arr.length; i++) {

			if ((previousEle % 2 != 0 && arr[i] % 2 == 0) || (previousEle % 2 == 0 && arr[i] % 2 != 0)) {
				res = res + 1;
				max = Math.max(max, res);
			} else {
				res = 1;
			}

			previousEle = arr[i];
		}

		return max;
	}

}
