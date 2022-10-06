package com.code.forces;

import java.util.Scanner;

public class Teamproblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		String line = sc.nextLine();
		String[] arr;
		int res = 0;
		for (int i = 0; i < size; i++) {
			arr = new String[3];
			line = sc.nextLine();
			arr = line.split(" ");
			int count = 0;
			for (int j = 0; j < 3; j++) {
				if (arr[j].equals("1")) {
					count++;
				}
			}
			if (count >= 2) {
				res++;
			}
		}
		System.out.println(res);
		sc.close();
	}
}
