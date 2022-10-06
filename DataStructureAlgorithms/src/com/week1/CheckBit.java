package com.week1;

public class CheckBit {
	public static void main(String[] args) {
		
		System.out.println(checkBit(17,4));
	}
	
	public static boolean checkBit(int n , int i) {
		return (n>>i)%2 ==1;
	}

}
