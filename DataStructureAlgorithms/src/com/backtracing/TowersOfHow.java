package com.backtracing;

public class TowersOfHow {

	public static void main(String[] args) {
		TOH(3, 'A', 'C', 'B');
	}

	public static void TOH(int n, char src, char dest, char temp) {

		if (n == 0)
			return;
		TOH(n - 1, src, temp, dest);
		System.out.println(n + " : " + src + " -> " + dest);
		TOH(n - 1, temp, dest, src);
	}

}
