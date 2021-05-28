package com.hundred.days.ds2;

public class ArrayQueueImpl implements Queue<Integer> {

	
	int[] arr=null;
	int top=0;
	int rear=-1;
	int max_size=0;
	
	public ArrayQueueImpl(int size) {
		arr = new int[size];
		max_size=size;
		
	}
	
	@Override
	public void add(Integer e) throws Exception {
		
		if(rear>=max_size) {
			 throw new Exception("size is full");
		}
		arr[++rear]=e;
		
	}

	

	@Override
	public int size() {
		return rear+1;
	}

	@Override
	public Integer poll() throws Exception {
		if(rear<=top) {
			throw new Exception("queue is empty");
		}
		int element =arr[top];
		
		shiftArr();
		
		
		return element;
	}

	private void shiftArr() {
		for(int i=0; i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear=rear-1;
		
	}

	@Override
	public Integer peek() throws Exception {
		// TODO Auto-generated method stub
		return arr[top];
	}
	
	public static void main(String[] args) {
		Queue<Integer> que = new ArrayQueueImpl(4);
		try {
			que.add(100);
			que.add(101);
			que.add(500);
			que.add(600);
			System.out.println(que.poll());
			System.out.println(que.peek());
			System.out.println(que.size());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
