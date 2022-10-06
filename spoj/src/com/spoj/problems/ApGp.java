package com.spoj.problems;

import java.util.Scanner;

public class ApGp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int num1 = Integer.parseInt(line.split(" ")[0]);
			int num2 = Integer.parseInt(line.split(" ")[1]);
			int num3 = Integer.parseInt(line.split(" ")[2]);
			
			if ((num2 - num1) == (num3 - num2)) {
				System.out.println("AP " + (num3 + (num3 - num2)));
				continue;
			}
			if (num1 == 0 || num2 == 0 || num3 == 0) {
				continue;
			}
			if ((num2 / num1) == (num3 / num2)) {
				System.out.println("GP " + (num3 * (num3 / num2)));
			}
		}

		sc.close();
	}

}
