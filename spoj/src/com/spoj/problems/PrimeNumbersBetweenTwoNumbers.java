package com.spoj.problems;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String line = sc.nextLine();
		for (int i = 0; i < size; i++) {
			line = sc.nextLine();
			betweenNum(Long.parseLong(line.split(" ")[0]), Long.parseLong(line.split(" ")[1]));
			System.out.println();
		}
		sc.close();
	}

	public static void betweenNum(long start, long end) {

		while (start <= end) {
			if (start == 2) {
				System.out.println(start);
			}
			if (start != 1 && start % 2 != 0) {
				isPrime(start);
			}
			start++;
		}
	}

	public static void isPrime(long num) {
		long div = 2;
		long temp = 0;
		while (div < num) {
			if (num % div == 0) {
				temp++;
				break;
			}
			div++;
		}
		if (temp == 0) {
			System.out.println(num);
		}
	}

}
