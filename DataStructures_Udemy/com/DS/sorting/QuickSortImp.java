package com.DS.sorting;

public class QuickSortImp {
	
	static Integer[] myArray = {19,0,0,45,6,3,8,12,4,12,0,43,45};

	public static void main(String args[]){
		display(myArray);
		partition(0,myArray.length-1);
		
		
	}
	
	
	public static void partition(int startIdx, int endIdx) {
		
		if(startIdx<endIdx) {
			
			int p = quickSort(startIdx, endIdx);
			
			partition(startIdx,p-1);
			partition(p+1,endIdx);
			
			display(myArray);
		}
	}
	
	
	public static int quickSort(int startIdx,int endIdx) {
		
		int lo = startIdx;
		int hi = endIdx;
		int pivot = hi;
		
		//Imagine a wall behind the lo
		
		for(int j=lo;j<=hi;j++) {
			
			if(j!=pivot  && myArray[j]<=myArray[pivot]) {
				
				swapElements(j,lo);
				lo++;
				
			}
			else if(j==pivot) {
				swapElements(lo,pivot);
			}
		}
		
		return lo;
		
	}
	
	
	public static void swapElements(int idx1,int idx2) {
		
		int temp = 0;
		
		temp = myArray[idx1];
		myArray[idx1] = myArray[idx2];
		myArray[idx2] = temp;
		
		
		
	}
	
	public static void display(Integer[] itemList) {
		for(int x :itemList) {
			System.out.print(x+",");
		}
		System.out.println();
		
	}
}
