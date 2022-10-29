package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine1 {

	public static void main(String[] args) {

		levelOrderTravsersalLineByline1(BinaryTreeImpl.getBinaryTree());

	}

	public static void levelOrderTravsersalLineByline1(Node root) {

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		queue.add(null);

		while (queue.size() > 1) {

			Node tempNode = queue.poll();

			if (tempNode == null) {
				System.out.println();
				queue.add(null);
				continue;
			}
			System.out.print(tempNode.key + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

}
