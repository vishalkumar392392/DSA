package com.geeks.arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 };
		System.out.println(subArray(arr, 15));
	}
	
	
	//Author solution
	// TC -> O(N)
	public static boolean subArray(int arr[], int sum) {

		int s = 0;
		int e = 0;
		int curr = 0;
		for (e = 0; e < arr.length; e++) {
			curr = curr + arr[e];
			while (sum < curr) {
				curr = curr - arr[s];
				s++;
			}
			if (sum == curr) {
				return true;
			}
		}
		return false;

	}

}
