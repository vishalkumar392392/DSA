package com.geeks.arrays;

public class SecondMaxNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 109, 6, 8, 3, 88, 99, 3, 111, 109 };
		System.out.println(secondMax(arr));
		System.out.println(secondMax2(arr));
	}

	// TC -> O(N+N)
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

	// TC -> O(N)
	static int secondMax2(int arr[]) {
		int res = 0;
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				res = largest;
				largest = arr[i];
			} else if (largest != arr[i] && (arr[i] > res || res == 0)) {
				res = arr[i];
			}
		}

		return res;
	}
}
