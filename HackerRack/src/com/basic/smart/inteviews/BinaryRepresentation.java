package com.basic.smart.inteviews;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		StringBuffer res =  new StringBuffer();
		

		for (int j = 0; j < size; j++) {
				long num = sc.nextLong();
				res = new StringBuffer();
				for (int i = 0; (1 << i) <= num; i++) {
					if (checkBit(num, i)) {
						res = res.append("1");
					} else {
						res = res.append("0");
					}
				}
				System.out.println(res.reverse());
		}
		sc.close();
	}

	public static boolean checkBit(long num, int position) {
		boolean res = ((num >> position) % 2 == 1);
		return res;
	}

}
