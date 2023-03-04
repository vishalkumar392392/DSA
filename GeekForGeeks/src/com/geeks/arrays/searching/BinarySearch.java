package com.geeks.arrays.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 9, 11, 15, 18 };

		System.out.println(binarySearch(arr, 0, arr.length - 1, 18));
		System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 18));


	}

	static boolean binarySearch(int arr[], int low, int high, int k) {

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k)
				return true;
			if (arr[mid] > k)
				high = mid - 1;
			else {
				low = mid + 1;
			}
		}
		return false;
	}

	static boolean binarySearchRecursive(int arr[], int low, int high, int k) {

		int mid = (low + high) / 2;
		if (arr[mid] == k)
			return true;
		if (arr[mid] > k) {
			return binarySearchRecursive(arr, low, mid - 1, k);
		} else {
			return binarySearchRecursive(arr, mid + 1, high, k);
		}
		
	}

}
