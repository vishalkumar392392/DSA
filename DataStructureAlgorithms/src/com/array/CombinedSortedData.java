package com.array;

// 2 pointer technique
public class CombinedSortedData {

	public static void main(String[] args) {

		int a[] = { 8, 12, 20, 24, 30 };
		int b[] = { -5, 6, 13, 19 };

		int p1 = 0;
		int p2 = 0;

		while (p1 < a.length && p2 < b.length) {

			if (a[p1] < b[p2]) {
				System.out.print(a[p1++] + " ");
			} else {
				System.out.print(b[p2++] + " ");
			}
		}

		if (p1 != a.length) {
			for (int i = p1; i < a.length; i++) {
				System.out.print(a[p1++] + " ");
			}
		}
		if (p2 != b.length) {
			for (int i = p2; i < b.length; i++) {
				System.out.print(b[p2++] + " ");
			}
		}

	}

}
