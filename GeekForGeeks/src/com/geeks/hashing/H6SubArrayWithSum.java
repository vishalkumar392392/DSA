package com.geeks.hashing;

import java.util.HashSet;

public class H6SubArrayWithSum {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 13, -3, -10, 5 };

		boolean res = efficientMethod(arr, 5);
		boolean naiveMethod = naiveMethod(arr, 5);
		System.out.println(naiveMethod);
		System.out.println(res);
	}

	private static boolean efficientMethod(int[] arr, int k) {

		HashSet<?> h = new HashSet<>();
		int prefixSum = 0;

		for (int i = 0; i < arr.length; i++) {

			prefixSum = prefixSum + arr[i];
			if (prefixSum == k) {
				return true;
			}
			if (h.contains(prefixSum - k)) {
				return true;
			}
		}

		return false;
	}

	private static boolean naiveMethod(int arr[], int k) {

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == k) {
					return true;
				}
			}
		}
		return false;
	}

}
