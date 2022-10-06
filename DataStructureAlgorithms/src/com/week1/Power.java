package com.week1;

public class Power {

	public static void main(String[] args) {
		System.out.println(powerOfTwo(45));
		System.out.println(powerOfTwo(45));
		System.out.println(power(3, 82));
	}
	
	public static long powerOfTwo(int num) {
		long ans = 1;
		for(int i = 0; i < num; i++) {
			ans = ans * 2;
		}
		return ans;
	}
	public static long powerOfTwoBit(int num) {
		return 1l<<num;
	}
	
	public static long power(int a, int n) {
		long ans = 1;
		for(int i = 1 ; i <= n; i++ ) {
			ans = ans * a;
		}
		return ans;
	}
}
