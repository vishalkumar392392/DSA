package com.geeks.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class H5SubArrayWithZeroSum {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 13, -3, -10, 5 };

		boolean res = efficientMethod(arr);
		boolean naiveMethod = naiveMethod(arr);
		System.out.println(naiveMethod);
		System.out.println(res);
	}

	private static boolean naiveMethod(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean efficientMethod(int[] arr) {

		HashSet<Integer> h = new HashSet<>();

		int prefixSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefixSum = prefixSum + arr[i];
			if (prefixSum == 0) {
				return true;
			}
			if (h.contains(prefixSum)) {
				return true;
			}
			h.add(prefixSum);
		}
		return false;
	}

}
