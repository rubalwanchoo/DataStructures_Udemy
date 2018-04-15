package com.DS.Hash;

public class HashTableArray<T> {

	int size;
	Entry[] hashArray;

	public HashTableArray(int size) {

		this.size=size;
		hashArray = new Entry[size];
		
		for(int j=0;j<size;j++){
			
			hashArray[j] = new Entry();
			
		}
	}
	
	
	private int getHash(int key){
		return key%size; //Can be replaced with custom algorithms for hashing
	}
	
	
	public void addNode(int key, Object value){
		
		int hashArrayIndex = getHash(key);
		
		Entry newNode = new Entry(key,value);
		
		newNode.next = hashArray[hashArrayIndex].next;
		hashArray[hashArrayIndex].next = newNode;
		
		
	}
	
public void addNode(int key, Object value,int hash){
		
		int hashArrayIndex = hash;
		
		Entry newNode = new Entry(key,value);
		
		newNode.next = hashArray[hashArrayIndex].next;
		hashArray[hashArrayIndex].next = newNode;
		
		
	}
	
	
	public T getValue(int key){
		T value = null;
		
		int hashArrayIndex = getHash(key);
		Entry n = hashArray[hashArrayIndex];
		
		while (n != null){
			
			System.out.println("Scanning "+(T)n.value);
			
			if(n.key == key){
				value= (T)n.value;
				break;
			}
			
			n=n.next;
		}
		
		
		return value;
	}
	
	public T getValueWithoutZeros(int key,int hash){
		T value = null;
		
		int hashArrayIndex = hash;
		Entry n = hashArray[hashArrayIndex];
		
		while (n != null){
			
			System.out.println("Scanning "+(T)n.value);
			
			if(n.key == key){
				value= (T)n.value;
				break;
			}
			
			n=n.next;
		}
		

		
		return value;
	}

}
