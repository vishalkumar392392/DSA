package com.code.chef;

import java.util.Scanner;

public class NumberOfCredits {

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println(4 * sc.nextInt() + 2 * sc.nextInt() + 0 * sc.nextInt());
		}
	}
}

//Problem
//In the current semester, you have taken 
//X RTP courses, 
//Y Audit courses and 
//Z Non-RTP courses.
//The credit distribution for the courses are:
//
//4 credits for clearing each RTP course.
//2 credits for clearing each Audit course.
//No credits for clearing a Non-RTP course.
//Assuming that you cleared all your courses, report the number of credits you obtain this semester.
//Input Format
//The first line contains a single integer 
//T, the number of test cases. 
//T test cases follow. Each test case consists of one line, containing 
//3 integers separated by spaces.
//The first integer is 
//X
//X, the number of RTP courses.
//The second integer is 
//Y
//Y, the number of Audit courses.
//The third integer is 
//Z
//Z, the number of non-RTP courses.
