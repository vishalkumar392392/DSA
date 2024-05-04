package com.geeks.linkedList;

public class LA9IntersectionPointDiffCountMethod {

	public static void main(String[] args) {

		Node head1 = getFirstLinkedList();
		Node head2 = getSecondLinkedList();

		int intersectionPoint = getIntersectionPoint(head1, head2);
		System.out.println(intersectionPoint);

	}

	private static int getIntersectionPoint(Node head1, Node head2) {

		Node temp = head1;
		int c1 = 0;
		while (temp != null) {
			temp = temp.next;
			c1++;
		}
		temp = head2;
		int c2 = 0;
		while (temp != null) {

			temp = temp.next;
			c2++;
		}

		int d = Math.abs((c1 - c2));

		int i = 0;

		while (i < d) {
			if (c1 > c2) {
				head1 = head1.next;
			}

			else {
				head2 = head2.next;
			}

			i++;

		}

		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				return head1.data;
			}

			head1 = head1.next;
			head2 = head2.next;
		}

		return 0;
	}

	private static Node getFirstLinkedList() {
		Node head = new Node(3);
		head.next = new Node(6);
		head.next.next = new Node(9);
		head.next.next.next = new Node(15);
		head.next.next.next.next = new Node(30);
		return head;
	}

	private static Node getSecondLinkedList() {
		Node head = new Node(10);
		head.next = new Node(15);
		head.next.next = new Node(30);
		return head;

	}

}
