package com.geeks.bitwise;

public class TwoOddAppearingNumbers {

	public static void main(String[] args) {
//		int arr[] = { 4, 4, 3, 4, 5, 5 };
		int arr1[] = { 5, 6, 10, 6, 10, 6, 3, 3 };

		twoOddAppearingNumbers(arr1);
	}

	public static void twoOddAppearingNumbers(int arr[]) {

		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		int res1 = 0, res2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				res1 = res1 ^ arr[i];
			} else {
				res2 = res2 ^ arr[i];
			}
		}

		System.out.println(res);
		System.out.println("res1 -> " + res1 + " res2 -> " + res2);
	}
}
