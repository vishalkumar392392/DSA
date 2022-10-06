package com.basic.smart.inteviews;

import java.util.Scanner;

// reading a string of integers via nextInt()
public class SumOfArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		long arr[];
		long sum = 0;
		for (int i = 0; i < size; i++) {
			int arraySize = sc.nextInt();
			arr = new long[arraySize];
			sum = 0;
			for (int k = 0; k < arraySize; k++) {
				arr[k] = sc.nextLong();
			}
			for (int j = 0; j < arraySize; j++) {
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
