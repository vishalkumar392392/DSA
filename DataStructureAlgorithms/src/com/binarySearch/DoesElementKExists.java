package com.binarySearch;

import java.util.Arrays;

public class DoesElementKExists {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };
		Arrays.sort(arr);
		System.out.println(binarySearch(arr, 0, arr.length - 1, 7));

	}

	public static boolean binarySearch(int arr[], int low, int high, int k) {

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k)
				return true;
			if (arr[mid] <= k)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return false;
	}

}
