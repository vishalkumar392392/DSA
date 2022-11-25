package com.geeks.bitwise;

public class CountSetBits {

	static int tbl[] = new int[256];
	static {
		tbl[0] = 0;
		for (int i = 1; i < 256; i++) {
			tbl[i] = tbl[i & (i - 1)] + 1;
		}
	}

	public static void main(String[] args) {

		System.out.println(countSetBits(7));
		System.out.println(countSetBitsApproach2(7));
		System.out.println(brainKerningamsAlgo(13));
		System.out.println(lookUpTable(13));
		

	}

	// TC -> O(32)
	public static int countSetBits(int n) {

		int count = 0;
		for (int i = 1; i <= 32; i++) {

			if ((n >> (i - 1) & n) != 0) {
				count++;
			}
		}

		return count;
	}

	// TC -> O(d) : d = No. of bits from last to MSB
	public static int countSetBitsApproach2(int n) {
		int count = 0;

		while (n > 0) {
			if (n % 2 != 0) {
				count++;
			}
			n = n / 2;
		}

		return count;
	}

	// Brain Kernongams Algorithms says count set bits can be done with
	// TC -> O(Set Bits)
	public static int brainKerningamsAlgo(int n) {
		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	// Look up table
	// TC -> O(1)
	public static int lookUpTable(int n) {
		return tbl[n & 255] + tbl[(n >> 8) & 255] + tbl[(n >> 16) & 255] + tbl[(n >> 24)];
	}

}
