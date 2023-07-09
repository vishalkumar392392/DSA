package com.geeks.arrays.searching;

public class MedianofSortedArrays {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 5, 15, 25, 35, 45 };
		int arr3[] = { 1, 2, 3, 4, 5, 6 };
		int arr4[] = { 10, 20, 30, 40, 50 };
		int arr5[] = { 10, 20, 30, 40, 50, 60 };
		int arr6[] = { 1, 2, 3, 4, 5 };
		System.out.println(median(arr5, arr6));
	}

	public static double median(int arr1[], int arr2[]) {

		int p1 = 0;
		int p2 = 0;
		int n = arr1.length + arr2.length;
		float arr[] = new float[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length + arr2.length; i++) {
			if (p1 < arr1.length && p2 < arr2.length && arr1[p1] < arr2[p2]) {
				arr[i] = arr1[p1];
				p1++;
			} else if (p1 < arr1.length && p2 < arr2.length) {
				arr[i] = arr2[p2];
				p2++;
			}
		}

		for (int i = p1 + p2; i < n && p1 < arr1.length; i++) {
			arr[i] = arr1[p1];
			p1++;
		}
		for (int i = p1 + p2; i < n && p2 < arr2.length; i++) {
			arr[i] = arr2[p2];
			p2++;
		}

		int mid = n / 2;

		if (n % 2 == 0) {
			return (arr[mid - 1] + arr[mid]) / 2;
		} else {
			return arr[n / 2];
		}

	}

}
