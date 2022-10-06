package com.array;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			int temp = 0;
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]= temp;
		}
		printArray(arr);
	}

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
