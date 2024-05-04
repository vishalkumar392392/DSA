package com.geeks.hashing;

import java.util.HashSet;

//unique elements count
public class H3UnionOfTwoUnsorted {

	public static void main(String[] args) {

		int a[] = { 10, 30, 10, 40 };
		int b[] = { 40, 5, 10, 15 };

//		naiveMethod(a, b);
//		naiveMethod2(a, b);
		efficientMethod(a,b);
	}

	private static void efficientMethod(int a[], int b[]) {
		HashSet<Integer> h = new HashSet<>();

		for (Integer i : a) {
			h.add(i);
		}
		for (Integer i : b) {
			h.add(i);
		}

		System.out.println(h.size());
	}

	private static void naiveMethod(int[] a, int[] b) {

		int arr[] = new int[1000];
		for (int i = 0; i < a.length; i++) {

			arr[a[i]] = a[i];

		}

		for (int i = 0; i < b.length; i++) {

			arr[b[i]] = b[i];

		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static void naiveMethod2(int a[], int b[]) {
		String s = "";

		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i] + "")) {
				s = s + a[i] + " ";
			}
		}

		for (int i = 0; i < b.length; i++) {
			String t = b[i] + "";
			if (!s.contains(t)) {
				s = s + b[i] + " ";
			}
		}

		String arr[] = s.trim().split(" ");
		System.out.println(arr.length);
	}
}
