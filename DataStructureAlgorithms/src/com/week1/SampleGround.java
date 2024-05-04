package com.week1;

public class SampleGround {

	public static void main(String[] args) {
		
		
		

		String str = "AAAAA";
		String pat = "AAA";
		
		int a = (int)pat.charAt(1);
		System.out.println("a: " + a);

//		String str = "A.B.C";
//		String pat = ".";
//
////		String str = "ABCABCD";
////		String pat = "ABCD";

		int w = pat.length();
		for (int i = 0; i <= str.length() - w; i++) {

			if (str.substring(i, w + i).equals(pat)) {
				System.out.print(i + " ");
			}
		}
	}

}
