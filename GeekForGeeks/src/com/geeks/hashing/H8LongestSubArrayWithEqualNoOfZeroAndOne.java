package com.geeks.hashing;

public class H8LongestSubArrayWithEqualNoOfZeroAndOne {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 0, 1, 0 };

		int length = efficient(arr);
		System.out.println(length);
	}

	private static int efficient(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}

		}
		return H7LongestSubArrayWithSum.efficient(arr, 0);
	}

}
