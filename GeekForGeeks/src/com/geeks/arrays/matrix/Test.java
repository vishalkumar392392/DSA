package com.geeks.arrays.matrix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(10);
		List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		for (Integer integer : collect) {
			System.out.println(integer);
		}
		
		
	}
}
