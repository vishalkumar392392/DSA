package com.geeks.arrays.searching;


//TC -> 0(N^2)
public class TripletInSortedArray {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 8, 12, 30 };

		for (int i = 0; i < arr.length; i++) {
			if (ifPairWithSum(arr, 100 - arr[i], i + 1, arr.length - 1)) {
				System.out.println("True");
			}

		}

	}

	// TC -> 0(n)
	public static boolean ifPairWithSum(int arr[], int k, int start, int last) {
		int p1 = start;
		int p2 = last;

		while (p1 <= p2) {
			if ((arr[p1] + arr[p2]) == k)
				return true;

			if ((arr[p1] + arr[p2]) < k) {
				p1++;
			} else {
				p2--;
			}
		}

		return false;
	}

}
