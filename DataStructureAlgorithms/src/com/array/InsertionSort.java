package com.array;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j >= 0 && j <= arr.length - 1; j--) {

				if (j > 0 && arr[j] < arr[j - 1]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

		printArray(arr);

	}

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
