package com.binary.tree;

import java.util.Objects;

public class InOrderTraversal {

	public static void main(String[] args) {
		Node root = BinaryTreeImpl.getBinaryTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
	}

	public static void inOrder(Node root) {
		if (Objects.nonNull(root)) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);

		}
	}

	public static void preOrder(Node root) {
		if (Objects.nonNull(root)) {
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);

		}
	}

	public static void postOrder(Node root) {
		if (Objects.nonNull(root)) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key + " ");

		}
	}

}
