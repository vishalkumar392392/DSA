package com.spoj.problems;

import java.util.Scanner;

public class InversionCount {

	public static int count = 0;

	public static void main(String[] args) {

//		solutionOne();

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		long arr[] = null;
		for (int i = 0; i < size; i++) {
			sc.nextLine();
			count = 0;
			int arrayElements = sc.nextInt();
			arr = new long[arrayElements];

			for (int m = 0; m < arrayElements; m++) {
				arr[m] = sc.nextInt();
			}

			mergeSort(arr, 0, arr.length - 1);
			System.out.println(count);

		}


		sc.close();

	}

	public static void solutionOne() {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = null;

		for (int i = 0; i < size; i++) {
			sc.nextLine();
			int count = 0;
			int arrayElements = sc.nextInt();
			arr = new int[arrayElements];

			for (int m = 0; m < arrayElements; m++) {
				arr[m] = sc.nextInt();
			}

			for (int j = 0; j < arrayElements; j++) {

				for (int k = 0; k < arrayElements; k++) {

					if ((j < k) && arr[j] > arr[k]) {
						count++;
					}
				}
			}

			System.out.println(count);
		}

		sc.close();
	}

	public static void mergeSort(long arr[], int low, int high) {

		if (low == high)
			return;
		int mid = (high + low) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);

	}

	private static void merge(long[] arr, int low, int mid, int high) {

		int p1 = low;
		int p2 = mid + 1;
		long temp[] = new long[high - low + 1];
		int i = 0;
		while (p1 <= mid && p2 <= high) {

			if (arr[p1] <= arr[p2]) {
				temp[i] = arr[p1++];
				i++;
			} else {
				count = count + mid - p1 + 1;
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
