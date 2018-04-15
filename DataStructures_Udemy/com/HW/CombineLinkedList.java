package com.HW;

import com.DS.*;

public class CombineLinkedList {

	//Integer[] linkedList1 = {1,5,10,15,20};
	//Integer[] linkedList2 = {5,1,12,13,14};
	//Assignment is to combine the two to achieve {1,14,5,13,10,12,15,1,20,5}
	
	public static void main(String[] args) {
		
		LinkedListU<Integer> ll1 = new LinkedListU<Integer>();
		
		ll1.addNodeAtEnd(1);
		ll1.addNodeAtEnd(5);
		ll1.addNodeAtEnd(10);
		ll1.addNodeAtEnd(15);
		ll1.addNodeAtEnd(20);
		
		System.out.println("LL1");
		ll1.display();
		//1,5,10,15,20
		
		
		StackLLImp<Integer> ll2 = new StackLLImp<Integer>();
		
		ll2.push(5);
		ll2.push(1);
		ll2.push(12);
		ll2.push(13);
		ll2.push(14);
		
		System.out.println("LL2");
		ll2.display();
		//14,13,12,1,5
		
		
		
		LinkedListU<Integer> ll3 = new LinkedListU<Integer>();
		
		for(int i =0;i<5;i++) {
			ll3.addNodeAtEnd(ll1.deleteNode());
			ll3.addNodeAtEnd(ll2.pop());
		}
			
		System.out.println("LL3");
		ll3.display();
		
	}

}
