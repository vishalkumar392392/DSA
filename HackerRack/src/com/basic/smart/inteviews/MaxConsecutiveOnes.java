package com.basic.smart.inteviews;

public class MaxConsecutiveOnes {

	public static int maxConsecutiveOnes(int N) {

		int res = 0;
		int count = 0;
		int a = 0;
		int b = 0;
		int finResult = 0;

		for (int i = 1; i <= 32; i++) {
			int val = (N >> (i - 1)) & 1;
			if (val == 1 && res == val) {
				count++;
			} else if (val == 1) {
				count++;
			} else {
				res = val;
				if (a != 0 && a > count) {
					finResult = a;
				} else {
					a = count;
				}
				count = b;
			}
		}
		return finResult;
	}

	public static int maxConsecutiveOnesApproch2(int N) {
		int count = 0;

		// We use a loop to perform AND operation on N and N<<1 and everytime
		// the trailing 1 from every sequence of consecutive 1s is removed.
		// Loop continues till N is reduced to 0.
		while (N != 0) {
			// Assigning result of AND operation to N
			N = (N & (N << 1));
			// increement of counter variable.
			count++;
		}
		// returning the answer.
		return count;
	}
}
