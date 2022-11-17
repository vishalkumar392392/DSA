package com.geeks.mathmatics.practice;

public class MultiplicationUnderMod {
	
	public static void main(String[] args) {
		System.out.println(multiplicationUnderModulo(3,4));
	}

	static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long m = 1000000007;
        return ((a%m) * (b%m))%m;
    }
}
