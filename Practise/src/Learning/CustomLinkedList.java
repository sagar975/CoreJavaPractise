package Learning;

import java.util.ArrayList;
import java.util.LinkedList;

class Node {

	int data;

	Node next;

	static Node head;

	public Node(int data) {

		this.data = data;

		this.next = null;

	}

	public static void getList() {

		while (head != null) {

			System.out.println(head.data);

			head = head.next;

		}

	}

}

public class CustomLinkedList {

	public static void main(String[] args) {

		Node one = new Node(5);

		Node two = new Node(6);

		Node three = new Node(7);

		one.head = one;
		one.next = two;
		two.next = three;

		LinkedList list = new LinkedList();

		list.add(three);

		Node.getList();

	}
}
