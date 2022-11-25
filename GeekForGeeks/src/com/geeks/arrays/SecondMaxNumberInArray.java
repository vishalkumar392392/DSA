package com.geeks.arrays;

public class SecondMaxNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 3, 88, 99, 3, 111 };
		System.out.println(secondMax(arr));
	}

	static int secondMax(int arr[]) {
		int res = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			res = Math.max(res, arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != res) {
				secondMax = Math.max(secondMax, arr[i]);
			}

		}

		return secondMax;
	}
}
