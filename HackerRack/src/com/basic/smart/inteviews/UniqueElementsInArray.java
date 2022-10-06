package com.basic.smart.inteviews;

import java.util.Scanner;

public class UniqueElementsInArray {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        long arr[] = new long[size];
	        for(int i = 0 ; i< size; i++){
	            arr[i] = sc.nextLong();
	        }
	        sc.close();
	        int temp = 0;
	        for(int i = 0 ; i< size; i++){
	            temp =0;
	            for(int j = 0; j< size; j ++){
	                if(i!=j && arr[i] == arr[j]){
	                    temp = 1;
	                    
	                }
	            }
	            if(temp == 0){
	                System.out.print(arr[i]+ " ");
	            }
	        }
	    }

}
