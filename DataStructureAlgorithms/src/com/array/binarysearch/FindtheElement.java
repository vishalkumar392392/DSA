package com.array.binarysearch;

import java.util.Arrays;

public class FindtheElement {

	public static void main(String[] args) {

		int arr[] = { 5, 67, 1, 8, 22, 99, 23 };

		Arrays.sort(arr);
		System.out.println(findTheElement(arr, 80, 0, arr.length - 1));
	}

	public static boolean findTheElement(int arr[], int k, int low, int high) {

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				return true;
			}
			if (arr[mid] <= k)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;

	}
}
