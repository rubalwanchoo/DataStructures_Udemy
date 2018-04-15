package com.DS;

import java.util.Arrays;

public class QueueDArray <T>{

	Object[] queueArray;
	int front;
	int rear;
	int size;
	
	public QueueDArray(int size) {
		
		this.size = size;
		queueArray = new Object[size];
		front = -1;
		rear=-1;
		
	}
	
	public boolean isQueueEmpty() {
		return ((front == -1) || (front>rear));
	}
	
	public boolean isQueueFull() {
		return (rear == size-1);
	}
	
	public int ensureQueueCapacity(int capacity) {
		
		int newCapacity = getArrayCount();
		
		if(newCapacity==size) {
			
			queueArray = Arrays.copyOf(queueArray, capacity);
			newCapacity= capacity;
			
		}
		System.out.println("Array length-"+newCapacity);
		return newCapacity;
	}
	
	
	public int getArrayCount() {
		int count = 0;
		
		for (Object x:queueArray) {
			if (x!= null)
				count++;
		}
		
		return count;
	}
	
	public void queueItems(Object newItem) {
		
		System.out.println("Adding item-"+(T)newItem);
		
		int capacity = ensureQueueCapacity(size+2);

		
		rear=rear+1;
		queueArray[rear]= newItem;
		if(front ==-1) {
			front++;
		}
		
		
		
	}
	
	public void dequeueItems() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("Removing from queue - "+(T)queueArray[front]);
			front= front+1;
			
		}
	}

}







