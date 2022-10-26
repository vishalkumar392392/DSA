package com.binary.tree;

import java.util.Objects;

public class PostOrderTraversal {

	public static void main(String[] args) {
		Node root = BinaryTreeImpl.getBinaryTree();
		postOrder(root);
	}

	public static void postOrder(Node root) {
		if (Objects.nonNull(root)) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key + " ");

		}
	}

}
