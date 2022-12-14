package com.geeks.arrays;

public class Test {
	
	public static void main(String[] args) {
		
		
		String input = "vishall";
		int index = 0;
		int tempCount = 0;
		int count = 0;
		
		for(int i =0; i<input.length(); i++) {
			tempCount = 0;
			for(int j = 0; j < input.length(); j++) {
				if(i!=j && input.charAt(i) == input.charAt(j)) {
					tempCount ++;
				}
			}
			if(tempCount > count) {
				count = tempCount;
				index = i;
			}
		}
		if(index > 0) {
			System.out.println(input.charAt(index));

		}
	}

}
