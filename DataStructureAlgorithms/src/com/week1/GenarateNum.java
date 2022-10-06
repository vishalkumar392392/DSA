package com.week1;

public class GenarateNum {

	
	public static void main(String[] args) {
		
		System.out.println("generate: "+ generate(3, 4));
	}
	
	public static int generate(int x, int y) {
		return (1<<x)|(1<<y);
	}
}
