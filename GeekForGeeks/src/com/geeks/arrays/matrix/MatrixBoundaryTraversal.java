package com.geeks.arrays.matrix;

public class MatrixBoundaryTraversal {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

		boundaryTraversal(arr);
	}

	private static void boundaryTraversal(int[][] arr) {

		int r = 5, c = 4;

		if (r == 1) {
			for (int i = 0; i < c; i++) {
				System.out.print(arr[0][i] + " ");
			}
		}
		if (c == 1) {
			for (int i = 0; i < r; i++) {
				System.out.print(arr[i][0] + " ");
			}
		}

		for (int i = 0; i < c; i++) {
			System.out.print(arr[0][i] + " ");
		}

		for (int i = 1; i < r; i++) {
			System.out.print(arr[i][c - 1] + " ");
		}

		for (int i = c - 2; i >= 0; i--) {
			System.out.print(arr[r - 1][i] + " ");
		}

		for (int i = r - 2; i >= 0; i--) {
			System.out.print(arr[i][0] + " ");
		}
	}
}
