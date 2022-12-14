package com.twopointer;

//count the no. of pairs which follow arr[i] > arr[j] and i < j
// we can use brute force which will leade n^2 TC
// BELOW WE ARE USING MERGE SORT, WHICH WILL LEAD TO NLOGN TC
public class CountThePairForCondition {

	public static int count = 0;

	public static void main(String[] args) {

		int arr[] = { 8, 12, 20, -3, 4, 5, 15, 20, 6, 3 };

		ms(arr, 0, arr.length - 1);

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.println(count);
	}

	private static void ms(int[] arr, int low, int high) {

		if (low == high)
			return;

		int mid = (low + high) / 2;
		ms(arr, low, mid);
		ms(arr, mid + 1, high);
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
				// this line is to count the pairs and this line is the only difference between
				// merge sort algorithm and to this problem.
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

}
