package com.basic.smart.inteviews;

import java.util.Scanner;

public class IsPowerOf2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = 0;
		for (int i = 0; i < size; i++) {
			long num = sc.nextLong();
			count = 0;
			for (int j = 0; (1 << j) <= num; j++) {
				if (checkBit(num, j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		sc.close();
	}

	public static boolean checkBit(long num, int position) {
		return ((num >> position) % 2 == 1);
	}

}
