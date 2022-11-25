package com.geeks.arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 3, 88, 99, 3, 98 };
		System.out.println(search(arr, 99));
	}

	public static int search(int arr[], int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}

		return -1;
	}
}
