package com.twopointer.binarysearch;

public class SortZeroAndOne {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int p1 = 0;
		int p2 = arr.length - 1;
		int temp = 0;

		while (p1 < p2) {

			if (arr[p1] == 0) {
				p1++;
			} else if (arr[p2] == 1)
				p2--;
			if (arr[p1] > arr[p2]) {
				temp = arr[p1];
				arr[p1] = arr[p2];
				arr[p2] = temp;
			}
		}

		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + " ");

		}

	}

}
