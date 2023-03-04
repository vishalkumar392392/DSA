package com.geeks.arrays.searching;

public class TwoPointerAppraoch {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 8, 12, 30 };

		System.out.println(ifPairWithSum(arr, 13));

	}

	//TC -> 0(n)
	public static boolean ifPairWithSum(int arr[], int k) {
		int p1 = 0;
		int p2 = arr.length - 1;

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
