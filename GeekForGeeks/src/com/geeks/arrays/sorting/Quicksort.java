package com.geeks.arrays.sorting;

public class Quicksort {

	public static void main(String[] args) {

		int arr[] = { 7, 3, 1, 9, 4, 2, 6 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void quickSort(int arr[], int lb, int up) {

		if (lb < up) {
			int loc = partition(arr, lb, up);
			quickSort(arr, lb, loc - 1);
			quickSort(arr, loc + 1, up);
		}

	}

	public static int partition(int arr[], int lb, int up) {

		int pivot = arr[lb];
		int start = lb;
		int end = up;

		while (start < end) {

			while (arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}

			if (start < end) {
				swap(arr, start, end);
			}
		}

		swap(arr, lb, end);
		return end;
	}

	public static void swap(int arr[], int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}
}
