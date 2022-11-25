package com.geeks.bitwise;

public class GreyConvertor {
	public static void main(String[] args) {
		System.out.println(greyConverter(10));
	}

	public static int greyConverter(int n) {
		
		if(n ==0) {
			return 0;
		}
		StringBuilder res = new StringBuilder("");
		for (int i = 1; i <= 32; i++) {
			int a = ((n >> (i - 1)) & 1) % 2;
			res.append(a);
		}
		res = res.reverse();
		String s = res.toString();
		String temp = "" + res.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if ((i + 1) < s.length()) {
				int parseInt = Integer.parseInt("" + s.charAt(i));
				int parseInt2 = Integer.parseInt("" + s.charAt(i + 1));
				int sds = parseInt ^ parseInt2;
				temp = temp + sds;
			}

		}

		int j = 0;
		int output = 0;
		for (int i = temp.length() - 1; i >= 0; i--) {
			if (temp.charAt(i) == '1') {
				output = output + (int) Math.pow(2, j);
			}
			j++;
		}
		return output;

	}
	
	static int greyConverterApproach(int n)
    {
        //Performing Right Shift on n, 1 time.
        int q = n >> 1;
        
        //returning the result of XOR opertaion of n and q 
        //which gives gray code.
        return n^q;
    }


}
