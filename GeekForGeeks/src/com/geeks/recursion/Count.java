package com.geeks.recursion;

public class Count {

	public static void main(String[] args) {
		System.out.println(count(39));
	}

	public static String count(int num) {

		if (num == 0)
			return "0";
		return num + " " + count(num - 1);
	}

}
