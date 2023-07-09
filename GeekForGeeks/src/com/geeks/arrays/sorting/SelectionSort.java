package com.geeks.arrays.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 1, 9, 4, 2, 6 };
		selectionsort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	private static void selectionsort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {

			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

	}

}
