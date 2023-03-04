package com.geeks.arrays;

public class PrefixSum {

	public static void main(String[] args) {

		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		
		

		for (int i = 1; i < arr.length; i++) {

			prefixSum[i] = prefixSum[i - 1] + arr[i];

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(prefixSum[i] + " ");
		}
		System.out.println();
		
		System.out.println(prefixSum(prefixSum, 0, 2));
		System.out.println(prefixSum(prefixSum, 1, 3));
		System.out.println(prefixSum(prefixSum, 2, 6));

	}

	static int prefixSum(int prefixSum[], int l, int r) {

		if (l == 0) {
			return prefixSum[r];
		} else {
			return prefixSum[r] - prefixSum[l - 1];
		}
	}

}
