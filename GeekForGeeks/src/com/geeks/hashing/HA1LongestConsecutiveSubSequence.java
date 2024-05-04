package com.geeks.hashing;

import java.util.HashSet;

public class HA1LongestConsecutiveSubSequence {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 3, 3, 2, 9, 10 };

		int length = efficient(a);
		System.out.println(length);

	}

	private static int efficient(int[] a) {

		HashSet<Integer> h = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			h.add(a[i]);
		}
		int res = 1;
		for (Integer i : h) {

			if (!h.contains(i - 1)) {

				int curr = 1;
				while (h.contains(i + curr)) {
					curr++;
				}
				res = Math.max(curr, res);

			}
		}

		return res;
	}

}
