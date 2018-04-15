package com.DS.Searching;

public class BinarySearch {

	
	public static void main(String args[]) {
		
		Integer[] itemList = {2,4,5,6,9,11,14,17,19,22,24,26,43,47,50,66,99,101,102,108,110};//20 indexes
		
		Integer searchItem = 47;//present at index 13
		
		int iterationCount = 0;
		
		int low = 0;
		boolean found = false;
		int high = itemList.length -1;
		int mid = low + (high-low)/2;
		
		System.out.println("low-"+low+" ,mid-"+mid+" ,high-"+high);
		
		while(low<high) {
			iterationCount++;
			System.out.println("Current iteration-"+iterationCount);
			
			if(searchItem==itemList[mid]) {
				System.out.println(searchItem +" found in "+iterationCount +" attempts");
				found=true;
				break;
			}
			else if(searchItem<itemList[mid]) {
				high = mid-1;
				System.out.println("new high"+high);
			}
			else if(searchItem>itemList[mid]) {
				low=mid+1;
				System.out.println("new low"+low);
			}
			
			mid = low + (high-low)/2;
			
			if(low==high)
				break;
		}
		
		System.out.println("Found-"+found);
		
		
	}
}
