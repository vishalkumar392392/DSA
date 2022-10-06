package com.code.chef;

import java.util.Scanner;

public class CarTrip {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i = 0 ; i< size; i++){
		    int kms = sc.nextInt();
		    if(kms < 300){
		        System.out.println(3000);
		    }else {
		        System.out.println(kms * 10);
		    }
		}
	}
}
