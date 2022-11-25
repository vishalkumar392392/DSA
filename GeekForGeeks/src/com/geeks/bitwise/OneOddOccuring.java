package com.geeks.bitwise;

public class OneOddOccuring {

	public static void main(String[] args) {

		int arr[] = { 9,12,2,11,2,2,10,9,12,10,9,11,2 };
		System.out.println(oneOddOccuring(arr));
		
		int a = (4<<1) + 4 + (4>>1);
		System.out.println(a);
	}
	
	static int test(int x) {
		return ((x&(x-1)));
	}

	public static int oneOddOccuring(int arr[]) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
