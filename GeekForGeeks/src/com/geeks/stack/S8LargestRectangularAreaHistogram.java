package com.geeks.stack;

public class S8LargestRectangularAreaHistogram {

	public static void main(String[] args) {

		int a[] = { 6, 2, 5, 4, 1, 5, 6 };
		int res = naiveMethod(a);
		System.out.println(res);
	}

	private static int naiveMethod(int[] a) {
		
		int res = 0;
		for(int i =0; i< a.length; i++) {
			int curr =a[i];
			for(int j = i-1; j >=0; j--) {
				if(a[j] >= a[i]) {
					curr += a[i]; 
				}else {
					break;
				}
			}
			
			for(int j =i+1; j<a.length; j++) {
				if(a[j] >=a[i]) {
					curr += a[i]; 
				}else {
					break;
				}
			}
			
			res = Math.max(res, curr);
		}
		
		return res;
	}

}
