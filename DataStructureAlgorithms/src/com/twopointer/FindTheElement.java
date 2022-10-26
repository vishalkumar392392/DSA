package com.twopointer;

import java.util.Arrays;

public class FindTheElement {

	public static void main(String[] args) {

		int arr[] = { 8, 4, 1, 7, 21, 45, 87, 99 };

		Arrays.sort(arr);

		int k = 8;

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= k) {
				System.out.println("found");
			}
			if (arr[mid] < k) {
				low = mid + 1;
			} else
				high = mid - 1;
		}

		System.out.println("Not Found");
	}

}
