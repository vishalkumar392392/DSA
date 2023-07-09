package com.geeks.arrays.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 7, 3, 1, 9, 4, 2, 6 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void bubbleSort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
