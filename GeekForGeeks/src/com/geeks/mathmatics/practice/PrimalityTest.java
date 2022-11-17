package com.geeks.mathmatics.practice;

public class PrimalityTest {
	
	public static void main(String[] args) {
		System.out.println(isPrime(97));
	}
	
	public static boolean isPrime(int N) {
	      // code here
	      if(N ==1) return false;
	      if(N ==2 || N == 3) return true;
	      if(N %2 ==0 || N%3 == 0) return false;
	      for(int i = 5; i*i <=N; i++){
	          if(N%i == 0) return false;
	      }
	      
	      return true;
	    }

}
