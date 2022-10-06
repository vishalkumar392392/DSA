package com.basic.smart.inteviews;

import java.util.Scanner;

public class MatrixRowSum {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        long arr[][] = new long[rows][columns];
        for(int i = 0; i<rows; i ++){
            for(int j = 0; j< columns; j++){
                arr[i][j] = sc.nextLong();
            }
        }
        long sum;
        for(int i = 0; i<rows; i ++){
            sum = 0;
            for(int j = 0; j< columns; j++){
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }

}
