package com.array.problem;

public class SearchForRange {

	public static void main(String[] args) {

		int A[] = { 5, 7, 7, 8, 8, 10, 10, 10, 10, 10 };
		int B = 10;

		int bs1 = bs1(A, B);
		int bs2 = bs2(A, B);
		System.out.println(bs1);
		System.out.println(bs2);

	}

	public int[] searchRange(final int[] A, int B) {
		int p1 = 0;
		int p2 = A.length;
		int res[] = { -1, -1 };

		while (p1 < p2) {
			int mid = (p1 + p2) / 2;
			if (A[mid] == B) {
				res[0] = mid;
				if ((mid + 1) < A.length && A[mid + 1] == B) {
					res[1] = mid + 1;
					p1 = mid + 1;
				}
				if ((mid - 1) >= 0 && A[mid - 1] == B) {
					res[1] = mid - 1;
					p2 = mid - 1;
				}

			}
			if (A[mid] < B)
				p1 = mid + 1;
			if (A[mid] > B)
				p2 = mid - 1;
		}

		return res;
	}

	public static int bs1(int arr[], int q) {

		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == q) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] < q) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

	public static int bs2(int arr[], int q) {

		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == q) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] < q) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

}
