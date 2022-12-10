package com.geeks.arrays;

public class FrequencyInSortedArray {

	public static void main(String[] args) {

		int arr[] = { 10, 10, 10, 25, 30, 30 };
		frequencyInSortedArray(arr);
	}

	// TC -> O(N)
	public static void frequencyInSortedArray(int arr[]) {

		int currentNum = Integer.MIN_VALUE;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (currentNum != arr[i]) {
				if (i != 0) {
					System.out.println(currentNum + " " + count);
				}

				currentNum = arr[i];
				count = 1;

			} else {
				count++;
			}
		}
		System.out.println(currentNum + " " + count);

	}

}
