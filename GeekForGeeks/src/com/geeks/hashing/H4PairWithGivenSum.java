package com.geeks.hashing;

import java.util.HashSet;

public class H4PairWithGivenSum {

	public static void main(String[] args) {

		int a[] = { 3, 2, 8, 15, -8 };
		int sum = 17;
//		System.out.println(naiveMethod(a, sum));
		System.out.println(efficientMethod(a, sum));
	}

	public static boolean naiveMethod(int a[], int sum) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int res = a[i] + a[j];
				if (res == sum) {
					return true;
				}
			}
		}

		return false;

	}

	public static boolean efficientMethod(int a[], int sum) {

		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			if (h.contains(sum - a[i])) {
				return true;
			}
			h.add(a[i]);

		}

		return false;
	}

}
