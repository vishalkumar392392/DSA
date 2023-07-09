package com.geeks.arrays.matrix;

public class SnakePattern {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		snakePattern(arr);
	}

	public static void snakePattern(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			int j = i % 2 == 0 ? 0 : 3;
			if (j % 2 == 0) {
				for (; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}

		}
	}

}
