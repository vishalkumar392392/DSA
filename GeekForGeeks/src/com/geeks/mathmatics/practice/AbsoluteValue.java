package com.geeks.mathmatics.practice;

public class AbsoluteValue {
	
	public static void main(String[] args) {
		System.out.println(absolute(-78));
	}

	public static int absolute(int I) {
        // code here
        
        if( I > 0) return I;
        else if( I < 0 ) return -1 * I;
        else return 0;
    }
}
