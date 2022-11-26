package com.geeks.arrays;

public class RemoveDuplicateElementsFromSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 20, 20, 30, 30, 30, 30 };
//		int arr[] = { 10, 10,10};

		removeDuplicates(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] removeDuplicates(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i - 1] == arr[i]) {
				delete(arr, i);
				i = 0;
			}
		}

		return arr;
	}

	static void delete(int arr[], int indexDup) {
		int i = 0;
		for (i = indexDup; i < arr.length && i + 1 < arr.length; i++) {
			arr[i] = arr[i + 1];
		}
		for (int j = i; j < arr.length; j++) {
			arr[j] = 0;
		}

	}

}
