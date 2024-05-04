package com.array.problem;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	
	public static void main(String[] args) {
		
        int[] nums =  {1, 34, 3,98,9,76,45,4};
        String largestNumber = generateLargestNumber(nums);
        System.out.println("Largest number: " + largestNumber);
    }

    public static String generateLargestNumber(int[] nums) {
        // Convert integers to strings for comparison
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }
        System.out.println();
        Arrays.sort(numStrings);
        for(int i=0; i<numStrings.length;i++) {
        	System.out.print(numStrings[i]+" ");
        }
        System.out.println();
        // Sort the strings using a custom comparator
        Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                return order2.compareTo(order1); // Reverse order for maximum result
            }
        });
        for(int i=0; i<numStrings.length;i++) {
        	System.out.print(numStrings[i]+" ");
        }
        // If the largest number is 0, return "0"
        if (numStrings[0].equals("0")) {
            return "0";
        }

        // Concatenate sorted strings to generate the largest number
        StringBuilder result = new StringBuilder();
        for (String numString : numStrings) {
            result.append(numString);
        }
        
        return result.toString();
    }

}
