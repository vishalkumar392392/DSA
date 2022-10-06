package com.basic.smart.inteviews;

import java.util.Scanner;

public class MissingNumInArray {

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
			int count = 0;
			for (int k = 1; k <=arrSize+1; k++) {
				count = 0;
				for (int m = 0; m < arrSize; m++) {

					if (arr[m] == k) {
						count++;
					}
				}

				if (count == 0) {
					System.out.println(k);
				}

			}
		}
	}

}
