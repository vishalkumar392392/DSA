package com.basic.smart.inteviews;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(squareRoot(25));
	}

	public static long squareRoot(int num) {

		int p1 = 0;
		int p2 = num;
		long ans = Integer.MIN_VALUE;

		while (p1 <= p2) {
			int mid = (p1 + p2) / 2;
			if (mid * mid == num) {
				return mid;
			} else if (mid * mid > num) {
				p2 = mid - 1;
			} else {
				p1 = mid + 1;
			}
		}

		return ans;
	}

}
