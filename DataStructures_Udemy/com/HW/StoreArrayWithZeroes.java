package com.HW;

import com.DS.Hash.*;

public class StoreArrayWithZeroes {

	//Given an array with multiple occurences of zeores in it, what is the best data
	//structure to store the data without storing 0's , but when an index is queries, 
	//the actual value of the array is retrievable
	
	static int[] myArray = {0,0,0,1,2,5,0,0,4,9,0,7,8,3,2,1,6};
	static int numberOfHashMapBuckets;
	static int numberOfItemsInEachBucket;
	
	
	
	public static void main(String[] args) {
		
		numberOfItemsInEachBucket = (int)Math.floor(Math.log10(myArray.length)/Math.log10(2));//n buckets with n ins 2^n
		numberOfHashMapBuckets = numberOfItemsInEachBucket+1; //to accommodate for value over rounded log base 2 value
	
		//(log x base b) = (log x base k)/(log b base k)
		//(log x base 2) = (log x base 10)/(log 2 base 10)
		System.out.println("numberOfHashMapBuckets-"+numberOfHashMapBuckets);
		System.out.println("numberOfItemsInEachBucket-"+numberOfItemsInEachBucket);
		//System.out.println(hashFunction(1));
		
		
		HashTableArray<Integer> hashArray = new HashTableArray<Integer>(numberOfHashMapBuckets);
		
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]!=0) {
				hashArray.addNode(i, myArray[i],getHash(i));
			}
			
		}
		
		int searchIndex = 4;
		

		if (hashArray.getValueWithoutZeros(searchIndex, getHash(searchIndex)) == null) {
			System.out.println("0");
		}else {
			System.out.println(hashArray.getValueWithoutZeros(searchIndex, getHash(searchIndex)));
		}
		
		
		
		
	}

	
	public static int getHash(int arrayIndex) {
		
		//spread items in each bucket evenly
		return (int)Math.floor(arrayIndex/numberOfItemsInEachBucket);
		
	}
	
}
