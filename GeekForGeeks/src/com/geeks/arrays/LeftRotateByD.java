package com.geeks.arrays;

public class LeftRotateByD {

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5 };
		int arr[] = { 10, 5, 30, 15 };

		leftRotateByD(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int arr1[] = { 10, 5, 30, 15 };

		leftRotateBydMethod2(arr1, 2);
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	// TC -> O(N+D)
	// SC -> O(D)
	public static void leftRotateByD(int arr[], int d) {
		int temp[] = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < arr.length; i++) {

			arr[i - d] = arr[i];
		}
		int j = 0;
		for (int i = arr.length - d; i < arr.length; i++) {
			arr[i] = temp[j];
			j++;
		}
	}

	// TC -> O(2N)
	// SC -> O(1)
	public static void leftRotateBydMethod2(int arr[], int d) {
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	static void reverse(int arr[], int low, int high) {
		while (low < high) {
			swap(arr, low, high);
			low++;
			high--;
		}
	}

	static void swap(int arr[], int low, int high) {

		int temp = arr[high];
		arr[high] = arr[low];
		arr[low] = temp;
	}

}
