package com.week1;

public class CountBits {
	
	public static void main(String[] args) {
		int count = 0;
		// 32 for int data type
		// 64 for long data type
		for(int i = 0; i< 32; i++ ) {
			if(checkBit(24, i)) {
				System.out.println("i: "+ i);
				count++;
			}
		}
		System.out.println("count: "+ count);
	}
	
	public static boolean checkBit(int n , int i) {
		return (n>>i)%2 ==1;
	}

}
