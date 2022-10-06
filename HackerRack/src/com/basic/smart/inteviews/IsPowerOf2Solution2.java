package com.basic.smart.inteviews;

import java.util.Scanner;

public class IsPowerOf2Solution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = 0;
		long rem = 0;
		for (int i = 0; i < size; i++) {
			long num = sc.nextLong();
			if (num == 1) {
				System.out.println("True");
				continue;
			}
			count = 0;
			while (num > 1) {
				rem = num % 2;
				num = num / 2;
				if (num != 1 && rem == 1) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		sc.close();
	}

}
