package com.geeks.mathmatics.practice;

import java.util.ArrayList;

public class QuadraticRoots {

	public static void main(String[] args) {

		quadraticRoot(2, 8, 8).forEach(i -> System.out.print(i + " "));

	}

	public static ArrayList<Integer> quadraticRoot(int a, int b, int c) {
		int det = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(det);
		ArrayList<Integer> list = new ArrayList<>();

		if (det > 0) {
			int root1 = (int) Math.floor((-b + sqrt) / (2 * a));
			int root2 = (int) Math.floor((-b - sqrt) / (2 * a));
			if (root1 > root2) {
				list.add(root1);
				list.add(root2);
			} else {
				list.add(root2);
				list.add(root1);
			}

		} else if (det == 0) {
			int s = 2 * a;
			int root = -(b / s);
			list.add(root);
			list.add(root);
		} else if (det < 0) {
			list.add(-1);
		}

		return list;
	}

}
