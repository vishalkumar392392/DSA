package com.basic.smart.inteviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SwapBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		List<Integer> res = null;
		long fin = 0;
		for (int i = 0; i < size; i++) {
			int number = sc.nextInt();
			res = new ArrayList<>();
			int co = 0;
			for (int j = 0; (1 << j) <= number + 1; j++) {
				if ((number >> j) % 2 == 1) {
					res.add(1);
				} else {
					res.add(0);
				}
				co++;
			}
//			System.out.println(Integer.parseInt(res.toString(), 2));
//			System.out.println(res);
//			System.out.println(res.reverse());
			System.out.println(res.stream().map(f -> "" + f).collect(Collectors.joining(",")));
			String aa = "";
//			for (int k = 0; k < res.length; k++) {
//
////				for (int m = 1; m < res.length(); m++) {
////					if (res.charAt(k) != res.charAt(m)) {
////						aa = "" + aa + res.charAt(m);
////					}
////				}
//			}
			
			
			
			System.out.println(aa);

		}

		sc.close();
	}

}
