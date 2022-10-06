package com.array.problem;

public class SortZerosAndOnes {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1 };

		int p1 = 0;
		int p2 = arr.length - 1;

		while (p1 < p2) {

			if (arr[p1] == 0)
				p1++;
			else if (arr[p2] == 1)
				p2--;
			if (arr[p1] > arr[p2]) {
				int temp = 0;
				temp = arr[p1];
				arr[p1] = arr[p2];
				arr[p2] = temp;
			}
		}
		printArray(arr);

	}

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
