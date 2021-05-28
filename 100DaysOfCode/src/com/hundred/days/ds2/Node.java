package com.hundred.days.ds2;

public class Node<E>{
	
	private E element;
	private Node<E> next;
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	
	
	
}
