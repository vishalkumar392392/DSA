package com.basic.smart.inteviews;

import java.util.Scanner;

public class RightAnglePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String res = "";

		for (int k = 0; k < size; k++) {
			int a = sc.nextInt();
			System.out.println("Case #" + (k + 1) + ":");
			for (int i = a; i > 0; i--) {
				res = "";
				for (int j = 1; j <= a; j++) {
					if (j >= i) {
						res = res + "*";
					} else {
						res = res + " ";

					}
				}
				System.out.println(res);
			}
		}

		sc.close();

	}

}
