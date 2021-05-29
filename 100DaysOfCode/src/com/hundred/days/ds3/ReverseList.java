package com.hundred.days.ds3;

public class ReverseList {

	static Node temp = null;
	static Node next = null;
	static Node reverse = null;

	public static Node reverseWithoutExtraSpace(Node head) {

		temp = head;

		while (temp != null) {

			next = temp.getNext();

			temp.setNext(null);
			if (reverse == null) {
				reverse = temp;
			} else {
				temp.setNext(reverse);
				reverse = temp;
			}

			temp = next;
		}

		return reverse;
	}

}
