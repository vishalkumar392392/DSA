package com.basic.smart.inteviews;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        for(int i = 0 ; i < size; i ++){
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        for(int i = 0 ; i < size; i ++){
            if(arr[i]%2 !=0){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
