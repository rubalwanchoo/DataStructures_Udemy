package com.Collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class myQueue {
	
	public static void main(String args[]) {
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		
		myQueue.add(5);
		myQueue.add(6);
		myQueue.add(3);
		
		
		System.out.println(myQueue.poll());
		
		
		
		PriorityQueue<Integer> myPQueue = new PriorityQueue<Integer>();
		
		myPQueue.add(5);
		myPQueue.add(6);
		myPQueue.add(3);
		
		System.out.println(myPQueue.poll());
		
		PriorityQueue<myQueue.Student> stud = new PriorityQueue<myQueue.Student>();
		
		stud.add(new Student("A",17));
		stud.add(new Student("B",9));
		stud.add(new Student("C",10));
		
		//while adding each element in the priority queue, the compareTo method is invoked and the head of the queue 
		//is compared to the element being added. The smallest element is added to the head of the queue.
		
		System.out.println(stud.poll().name);
		
		
	}
	
	
	public static class Student implements Comparable<Student>{
		
		String name;
		int age;
		
		public Student(String name,int age){
			this.name = name;
			this.age=age;
		}
		
		
		public int compareTo(Student o) {
			
			if(this.age == o.age) {
				return 0;
			}
			else if(this.age>o.age){
				return 1; //can be any positive value other than 1
			}
			else
				return -1;//can be any negative value other than -1
			
		}
		
		
	}
}
