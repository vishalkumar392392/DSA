package com.geeks.bitwise;

public class TestArea {

	public static void main(String[] args) {
		System.out.println(fun(513,2));
	}

	static int fun(int n, int r) {

		if(n>0) return (n%r + fun(n/r,r));
		else return 0;

	}

}
