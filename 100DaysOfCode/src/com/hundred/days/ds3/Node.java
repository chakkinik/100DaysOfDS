package com.hundred.days.ds3;



public class Node {

	@Override
	public String toString() {
		return "Node [element=" + element + ", next=" + next + "]";
	}

	public Integer element;
	public Node next;

	Node() {
	}

	public Node(Integer e) {
		this.element = e;
		this.next = null;
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
