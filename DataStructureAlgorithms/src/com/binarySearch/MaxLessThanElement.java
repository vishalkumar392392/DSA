package com.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLessThanElement {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			System.out.println(findElement(arr, 0, arr.length - 1, sc.nextInt()));
		}
		sc.close();
	}

	public static int findElement(int arr[], int low, int high, int q) {
		int ans = Integer.MIN_VALUE;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] < q) {
				ans = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return ans;
	}

}
