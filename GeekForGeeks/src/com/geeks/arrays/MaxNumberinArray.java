package com.geeks.arrays;

public class MaxNumberinArray {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 3, 88, 99, 3, 111 };
		System.out.println(max(arr));
	}

	public static int max(int arr[]) {

		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			res = Math.max(res, arr[i]);
		}

		return res;
	}

}
