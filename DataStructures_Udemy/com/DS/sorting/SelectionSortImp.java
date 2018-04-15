package com.DS.sorting;

public class SelectionSortImp {

	
	
	public static void main(String[] args) {
	
		Integer[] itemList = {16,7,99,14,3,32,4};
		int min = 0;
		int minIndex = 0;
		int temp = 0;
			
		
		for(int i=0;i<itemList.length;i++){
			
			min = itemList[i];
			
			for(int j = i+1;j<itemList.length;j++){
				
				System.out.println("Comparing "+min+"  and "+itemList[j]);
				
				if(itemList[j]<min){
					min = itemList[j];
					minIndex = j;
				}
				
			}
			
			temp= itemList[i];
			itemList[i] = min;
			itemList[minIndex] = temp;
			
			
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
