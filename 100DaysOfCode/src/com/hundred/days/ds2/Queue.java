package com.hundred.days.ds2;

public interface Queue<E> {
	
	
	public void add(E e) throws Exception;
	
	
	public E poll() throws Exception;
	
	public E peek()throws Exception;
	
	public int size();

}
