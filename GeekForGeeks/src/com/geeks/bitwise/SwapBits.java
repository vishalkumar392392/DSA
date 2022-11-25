package com.geeks.bitwise;

public class SwapBits {
	
	public static void main(String[] args) {
		System.out.println(swapBits(2));
	}
	
	public static int swapBits(int n) {
		
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
		String finRes = "";
		for(int i=0; i<s.length(); i = i+2) {
			if(i < s.length()-1) {
				finRes = finRes  + s.charAt(i+1) + s.charAt(i);

			}
		}
		int j = 0;
		int output = 0;
		for (int i = finRes.length() - 1; i >= 0; i--) {
			if (finRes.charAt(i) == '1') {
				output = output + (int) Math.pow(2, j);
			}
			j++;
		}
		
		return output;
	}

}
