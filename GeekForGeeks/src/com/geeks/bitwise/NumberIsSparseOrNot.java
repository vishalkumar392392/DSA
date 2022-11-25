package com.geeks.bitwise;

//A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
public class NumberIsSparseOrNot {
	
	public static void main(String[] args) {
		System.out.println(isSparse(41));
	}
	
	public static boolean isSparse(int n)
    {
        int res = 0;
        for(int i=1; i<=32; i++){
            int val = (n>>(i-1)) & 1;
            if(val ==1 && res==val){
                return false;
            }else{
                res =val;
            }
        }
        
        return true ;
    }

}
