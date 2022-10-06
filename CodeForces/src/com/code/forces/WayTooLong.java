package com.code.forces;

import java.util.Scanner;

public class WayTooLong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String name = sc.nextLine();
		for (int i = 0; i < size; i++) {
			name = sc.nextLine();
			if (name.length() > 10) {
				System.out.print(name.charAt(0));
				System.out.print(name.length() - 2);
				System.out.print(name.charAt(name.length() - 1));
				System.out.println();
			} else {
				System.out.println(name);
				System.out.println();
			}
		}
		sc.close();
	}

}
