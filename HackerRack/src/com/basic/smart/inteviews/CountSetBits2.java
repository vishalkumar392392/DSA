package com.basic.smart.inteviews;

import java.util.Scanner;

public class CountSetBits2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			int count = 0;
			for (int j = 0; (1 << j) <= num; j++) {
				if (((num >> j) % 2 == 1)) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
