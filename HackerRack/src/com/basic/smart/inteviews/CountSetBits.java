package com.basic.smart.inteviews;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			long num = sc.nextLong();
			System.out.println(countSetBits(num));
		}
		sc.close();
	}
	
	static int countSetBits(long n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

}
