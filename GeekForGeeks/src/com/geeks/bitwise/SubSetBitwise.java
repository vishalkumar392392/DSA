package com.geeks.bitwise;

public class SubSetBitwise {

	public static void main(String[] args) {

		subSet("vishal");
	}

	// TC -> 2^N * N
	public static void subSet(String s) {
		int n = s.length();
		int pSize = 1 << n;
		
		for(int i= 0; i< pSize ;i++) {
			for(int j=0; j< n; j++) {
				if(((i >> j) & 1) !=0) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
