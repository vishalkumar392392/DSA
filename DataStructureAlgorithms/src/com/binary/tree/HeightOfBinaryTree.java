package com.binary.tree;

import java.util.Objects;

public class HeightOfBinaryTree {

	public static void main(String[] args) {

		Node root = BinaryTreeImpl.getBinaryTree();
		System.out.println(height(root));

	}

	public static int height(Node root) {

		if (Objects.isNull(root))
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;
	}

}
