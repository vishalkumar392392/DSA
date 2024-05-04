package com.geeks.hashing;

public class H9LongestCommonSpanWithSameSumInBinaryArray {
	
	
	public static void main(String[] args) {
		
		int a[] = {0,1,0,0,0,0};
		int b[] = {1,0,1,0,0,1};
		
		int length = efficient(a,b);
		System.out.println(length);
	}

	private static int efficient(int[] a, int[] b) {

		int temp[] = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			temp[i] = a[i] - b[i];
		}
		
		return H7LongestSubArrayWithSum.efficient(temp, 0);
	}

}
