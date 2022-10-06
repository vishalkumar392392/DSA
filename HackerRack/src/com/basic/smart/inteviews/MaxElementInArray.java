package com.basic.smart.inteviews;

import java.util.Scanner;

public class MaxElementInArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long arr[] = new long[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextLong();
		}
		int temp = 0;
		for (int i = 0; i < size; i++) {
			temp = 0;
			for (int j = 0; j < size; j++) {
				if (i != j) {
					if (arr[i] < arr[j]) {
						temp = 1;
						break;
					}
				}
			}
			if (temp == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
