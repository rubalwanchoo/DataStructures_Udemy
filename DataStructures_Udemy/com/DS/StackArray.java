package com.DS;

public class StackArray <T>{

	int size;
	int top = -1;
	Object[] stackArray;
	
	public StackArray(int size) {
		
		this.size = size;
		stackArray = new Object[size];
	}
	
	
	public void push(Object newItem){
		
		if(isStackFull()){
			System.out.println("stack is full");
		}else{
			top++;
			stackArray[top] = newItem;
		}
		
		
		
	}
	
	
	public T pop(){
		if(isStackEmtpy()){
			System.out.println("stack is empty");
			return null;
		}
		
		T poppedItem = (T)stackArray[top];
		//System.out.println("Popping value "+ poppedItem);
		top--;
		
		return poppedItem;
	}
	
	
	private Boolean isStackEmtpy(){
		return (top == -1);
	}
	
	private Boolean isStackFull(){
		return (top == size-1);
	}
	

}
