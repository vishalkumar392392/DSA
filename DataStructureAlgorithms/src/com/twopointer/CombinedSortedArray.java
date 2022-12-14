package com.twopointer;

// 2 pointer for combining two sorted arrays
public class CombinedSortedArray {

	public static void main(String[] args) {

		int arr1[] = { 4, 7, 9, 11, 15 };
		int arr2[] = { -5, 3, 5, 16, 20, 25 };

		int temp[] = new int[(arr1.length) + (arr2.length)];

		int p1 = 0;
		int p2 = 0;
		int i = 0;
		while (p1 < arr1.length && p2 < arr2.length) {

			if (arr1[p1] < arr2[p2]) {
				temp[i] = arr1[p1];
				p1++;
			} else {
				temp[i] = arr2[p2];
				p2++;
			}

			i++;
		}

		while (p1 < arr1.length) {
			temp[i] = arr1[p1];
			p1++;
			i++;
		}
		while (p2 < arr2.length) {
			temp[i] = arr2[p2];
			p2++;
			i++;
		}
		for (int j = 0; j < temp.length; j++) {

			System.out.print(temp[j] + " ");

		}
	}

}
