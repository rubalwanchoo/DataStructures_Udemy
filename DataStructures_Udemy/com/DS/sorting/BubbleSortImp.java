package com.DS.sorting;

public class BubbleSortImp {

	public static void main(String args[]){
		
		Integer[] itemList = {5,18,3,19,222,34,76,1,54}; 
		int temp = 0;
		int currentItem = 0;
		int nextItem = 0;
		
		
		
		for(int i=itemList.length-1;i>=0;i--){
			//Running till the last element is bubbled up to be the highest

			for(int j=0;j<i;j++){
				
				currentItem = itemList[j];
				nextItem = itemList[j+1];
				
				System.out.println("Comparing "+currentItem+" and "+nextItem);
							
				if(currentItem>nextItem)
				{
					
					itemList[j+1]=currentItem;
					itemList[j] = nextItem;
	
				}
				
				
				
				
			}
			
			display(itemList);
			
			
		}
		
	}
	
	
	public static void display(Integer[] itemList) {
		for(int x :itemList) {
			System.out.print(x+",");
		}
		System.out.println();
		
	}
}
