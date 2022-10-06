package com.array.problem;

import java.util.Scanner;

public class CountTheRepeatedQueryElement {

	public static void main(String[] args) {

		int arr[] = { 8, 10, 10, -4, 2, 2, 6, 2, 2, 10, 8, 3, 2, 10, 2, -4 };

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {

			int num = sc.nextInt();
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[j] == num) {
					count++;
				}
			}
			System.out.println("Count: " + count);
		}

		sc.close();
	}

}
