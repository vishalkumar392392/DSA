package com.geeks.hashing;

import java.util.HashSet;

public class H2IntersectionOfTwoUnsortedArrays {

	public static void main(String[] args) {

		int a[] = { 10, 15, 20, 25, 30, 50 };
		int b[] = { 30, 5, 15, 80 };
//		naiveMethod(a, b);
		efficientMethod(a,b);

	}

	public static void naiveMethod(int a[], int b[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

	public static void efficientMethod(int a[], int b[]) {

		HashSet<Integer> h = new HashSet<>();

		for (int j = 0; j < b.length; j++) {
			h.add(b[j]);
		}
		for (int i = 0; i < a.length; i++) {
			if (h.contains(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
