package com.array;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					swap(arr, j);

				}
			}
		}
		printArray(arr);
	}

	private static void swap(int[] arr, int j) {
		int temp;
		temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
