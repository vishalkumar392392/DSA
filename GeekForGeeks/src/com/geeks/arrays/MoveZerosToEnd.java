package com.geeks.arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

//		int arr[] = { 8, 5, 0, 10, 0, 20 };
//		int arr[] = { 0, 0, 0, 10, 0 };
//		int arr[] = { 10,20 };
//		int arr[] = { 10, 5, 0,0, 0, 8, 0, 9, 0 };
		int arr[] = { 10, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 8, 0, 9, 0 };

//		int arr[] = { 10, 8, 0, 0, 12, 0 };
		int arr1[] = { 10, 5, 0, 0, 0, 8, 0, 9, 0 };

		moveZeros(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		moveZerosAuthorsMethos(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

	public static int[] moveZerosAuthorsMethos(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}

		return arr;
	}

	public static int[] moveZeros(int arr[]) {

		int res = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && res == -1) {
				res = i;
			}
			if (arr[i] != 0 && res != -1) {
				arr[res] = arr[i];
				arr[i] = 0;
				if (arr[res + 1] == 0) {
					res = res + 1;

				} else {
					res = i;
				}
			}
		}
		return arr;
	}

}
