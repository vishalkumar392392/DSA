package com.geeks.bitwise;

public class IsPowerOfTwo {

	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerofTwo(1099511627776l));
	}

	// TC -> O(set bit)
	public static boolean isPowerOfTwo(int n) {

		int count = 0;
		while (n > 0) {
			n = n & (n - 1);
			count++;
		}

		return count == 1;
	}

	// Navie solution
	public static boolean isPowerOfTwoNavie(int n) {

		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
	
	
	// for long numbers which require 64 bit
	public static boolean isPowerofTwo(long n){
        if(n==0) return false;
        int count =0;
        // Your code here
        for(int i =1; i<=64;i++){
            if(((n>>(i-1)) & 1) !=0){
                count++;
            }
            if(count >=2){
                return false;
            }
        }
                
        return count ==1;
    }

}
