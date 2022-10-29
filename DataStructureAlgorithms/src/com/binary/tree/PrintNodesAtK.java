package com.binary.tree;

import java.util.Objects;

public class PrintNodesAtK {

	public static void main(String[] args) {

		printDist(BinaryTreeImpl.getBinaryTree(), 2);

	}

	public static void printDist(Node root, int k) {

		if (Objects.isNull(root))
			return;
		if (k == 0) {
			System.err.println(root.key);
		} else {
			printDist(root.left, k - 1);
			printDist(root.right, k - 1);
		}
	}

}
