package com.DS.Searching;

public class InterpolationSearch {

	
	public static void main(String args[]) {
		
		Integer[] itemList = {2,4,6,8,10,12,14,16};//8 indexes
		
		Integer searchItem = 4;//present at index 13
		
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
			
			mid = low + ((searchItem-itemList[low])*(high-low)/(itemList[high]-itemList[low]));
			System.out.println("New mid-"+mid);
			
			if(low==high)
				break;
		}
		
		System.out.println("Found-"+found);
		
		
	}
}
