package com.array.problem;

import java.util.Scanner;

public class MaxLessThanElement {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 7, 1, 90, -1 };
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			int element = 0;
			int num = sc.nextInt();
			for (int j = 0; j < arr.length; j++) {
				if (num >= arr[j] && element < arr[j]) {
					element = arr[j];
				}
			}
			System.out.println("element: " + element);
		}

		sc.close();
	}

}
