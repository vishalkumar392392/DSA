package com.geeks.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {

		int arr[] = { 3, 0, 1, 2, 5 };
		int arr1[] = { 2, 0, 2 };
		int arr2[] = { 3, 2, 1 };
		int arr3[] = { 1, 2, 3 };
		int arr4[] = { 5, 0, 6, 2, 3 };
		System.out.println(trappingRainWaterNaive(arr4));
		System.out.println(effecientSolution(arr4));

	}

	// TC -> 0(N^2)
	public static int trappingRainWaterNaive(int arr[]) {

		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {

			int lmax = arr[i];
			for (int j = 0; j < i; j++) {
				lmax = Math.max(lmax, arr[j]);
			}
			int rmax = arr[i];
			for (int j = i + 1; j < n; j++) {
				rmax = Math.max(rmax, arr[j]);
			}
			res = res + (Math.min(lmax, rmax) - arr[i]);
		}

		return res;
	}

	// TC -> 0(N)
	// SC -> 0(N+N)
	public static int effecientSolution(int arr[]) {

		int n = arr.length;
		int res = 0;
		int lmax[] = new int[n];
		int rmax[] = new int[n];

		lmax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lmax[i] = Math.max(arr[i], lmax[i - 1]);
		}
		rmax[n - 1] = arr[n - 1];
		for (int j = n - 2; j >= 0; j--) {
			rmax[j] = Math.max(arr[j], rmax[j + 1]);
		}

		for (int i = 1; i < n - 1; i++) {
			res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
		}

		return res;
	}

	// Wont work for all the cases
	// MY Appraoch
	// TC -> 0(N^2)
	public static int trappingRainWater(int arr[]) {

		int trappedWater = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				max++;
			} else {
				max = Math.max(max, arr[i]);

			}
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					trappedWater = trappedWater + (arr[i] - arr[j]);
				}
			}
		}

		return max != arr[0] ? trappedWater : 0;
	}

}
