package com.hundred.days.ds2;

public class SingleLinkedList<E>{
	
	
	Node<E> head;
	
	public SingleLinkedList() {
		
	}
	
	public void add(E e) {
		Node node = new Node<E>();
		node.setElement(e);
		if(head==null) {
			head=node;
		}
		
		
	}
	
	public void remove(E e) {
		
	}
	public void remove(E e, int index) {
		
	}
	
	public void iterator() {
		
	}

}
