package com.geeks.arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		leftRotate(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// TC -> O(N)
	public static int[] leftRotate(int arr[]) {
		int ele = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}

		arr[arr.length - 1] = ele;
		return arr;
	}

}
