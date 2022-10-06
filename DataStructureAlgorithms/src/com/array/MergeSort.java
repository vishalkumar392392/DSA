package com.array;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);

	}

	public static void mergeSort(int arr[], int low, int high) {

		if (low == high)
			return;
		int mid = (high + low) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);

	}

	private static void merge(int[] arr, int low, int mid, int high) {

		int p1 = low;
		int p2 = mid + 1;
		int temp[] = new int[high - low + 1];
		int i = 0;
		while (p1 <= mid && p2 <= high) {

			if (arr[p1] <= arr[p2]) {
				temp[i] = arr[p1++];
				i++;
			} else {
				temp[i] = arr[p2++];
				i++;
			}
		}

		while (p1 <= mid) {
			temp[i] = arr[p1++];
			i++;
		}
		while (p2 <= high) {
			temp[i] = arr[p2++];
			i++;
		}

		for (int j = 0; j < high - low + 1; j++) {
			arr[low + j] = temp[j];
		}

	}

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
