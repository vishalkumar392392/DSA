package com.basic.smart.inteviews;

import java.util.Scanner;

public class MissingNumInArray2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int arrSize = sc.nextInt();
			int arr[] = new int[arrSize];
			for (int j = 0; j < arrSize; j++) {
				int num = sc.nextInt();
				arr[j] = num;
			}
			int sum = 0;
			int n = arrSize + 1;
			int sumofElements = n * (n + 1) / 2;
			for (int k = 0; k < arrSize; k++) {
				sum = sum + arr[k];
			}
			System.out.println(sumofElements - sum);
		}

		sc.close();
	}

}
