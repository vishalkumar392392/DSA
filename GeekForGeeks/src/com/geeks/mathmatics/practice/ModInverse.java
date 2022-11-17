package com.geeks.mathmatics.practice;

public class ModInverse {
	
	public static void main(String[] args) {
		System.out.println(modInverse(10,17));
	}
	
	public static int modInverse(int a, int m)
    {
      for(int i = 1; i<=m; i++){
          if((a*i) % m == 1) {
              return i;
          }
      }
      
      return -1;
    }

}
