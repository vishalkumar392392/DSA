package com.spoj.problems;

import java.util.Scanner;

public class Life {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			if(a != 42){
				System.out.println(a);
			}else {
				break;
			}
		}
		sc.close();
	}

}
