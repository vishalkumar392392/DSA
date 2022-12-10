package com.geeks.arrays;

public class LeadersInArray {

	public static void main(String[] args) {

		int arr[] = { 7, 10, 4, 3, 6, 5, 2 };
		leaders(arr);
	}

	public static void leaders(int arr[]) {
		int currentleader = arr[arr.length - 1];
		System.out.print(currentleader + " ");
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1] && arr[i] > currentleader) {
				System.out.print(arr[i] + " ");
				currentleader = arr[i];
			}
		}
	}

}
