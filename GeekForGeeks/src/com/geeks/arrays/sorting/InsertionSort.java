package com.geeks.arrays.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 1, 9, 4, 2, 6 };

		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
