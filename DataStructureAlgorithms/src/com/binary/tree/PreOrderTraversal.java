package com.binary.tree;

import java.util.Objects;

public class PreOrderTraversal {

	public static void main(String[] args) {
		Node root = BinaryTreeImpl.getBinaryTree();

		preOrder(root);

	}

	public static void preOrder(Node root) {
		if (Objects.nonNull(root)) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);

		}
	}
}
