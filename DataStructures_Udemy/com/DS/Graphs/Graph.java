package com.DS.Graphs;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
	
	
	int size;
	AdjList[] adjListArray;
	
	public Graph(int size){
		this.size = size;
		
		adjListArray = new AdjList[this.size];
		
		for(int i=0;i<size;i++){
			adjListArray[i] = new AdjList();
			adjListArray[i].head = null;
		}
	}
	
	public void addNode(int src, int dest){
		
		Node destNode = new Node(dest,null);
		
		destNode.next = adjListArray[src].head;
		adjListArray[src].head = destNode;
	}
	
	public void DFSExplore(int startVertex){
		
		Boolean[] isVisited = new Boolean[size];//Define a boolean for all node items to keep a track of visit flag
		
		for(int i=0;i<size;i++){//Mark all nodes visited as false initially
			isVisited[i] = false;
		}
				
		Stack<Integer> st = new Stack<Integer>(); // Push all nodes being visited. Dont pop a node until all child nodes for that node are visited
		
		int n = startVertex;
		st.push(n);

		
		while(!st.isEmpty()){
			
			
			n= st.pop();
			st.push(n);
			isVisited[n]= true;
			
			Node myNode = adjListArray[n].head;
			Boolean isDone = true; //Assume all child nodes for the current parent node are visited and done
			
			while(myNode!=null){
				
				if(!isVisited[myNode.value]){
					st.push(myNode.value);
					isVisited[myNode.value] = true;
					isDone = false;
					break;
				}else{
					myNode = myNode.next;
				}
			}
			if(isDone){
				System.out.println("Visited node - "+st.pop());
			}
		}
		
	}
	
	
	public void BFSExplore(int startVertex){
		
		Boolean[] isVisited = new Boolean[size];//Define a boolean for all node items to keep a track of visit flag
		
		for(int i=0;i<size;i++){//Mark all nodes visited as false initially
			isVisited[i] = false;
		}
				
		Queue<Integer> q= new LinkedList<Integer>(); // Push all nodes being visited. Remove the item that is visited.
		
		int n = startVertex;
		q.add(n);

		
		while(!q.isEmpty()){
			
			
			n= 	q.poll();
			System.out.println("Visited node - "+n);
			
			isVisited[n]= true;
			
			Node myNode = adjListArray[n].head;
						
			while(myNode!=null){
				
				if(!isVisited[myNode.value]){
					q.add(myNode.value);
					isVisited[myNode.value] = true;
			
					
				}else{
					myNode = myNode.next;
				}
			}
			
		}
		
	}
	
	
}
