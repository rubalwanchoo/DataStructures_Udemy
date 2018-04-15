package com.DS.sorting;

public class HeapSortImp {

	public static void main(String[] args) {

		int[] myArray =  {10,12,6,4,9,7,1,18,5};
		
		int n = myArray.length;
		
		for(int i = n/2-1;i>=0;i--){
			heapify(myArray,n,i);
		}
		
		//move current root to end and heapify array barring the current root
		for(int i = n-1;i>=0;i--){
			
			int temp = myArray[0];
			myArray[0] = myArray[i];
			myArray[i] = temp;
			
			heapify(myArray,i,0);
		}
		
		System.out.println("Final Array- ");
		display(myArray);

	}
	

	
	
	
	public static void heapify(int[] arr, int n, int i){
		//array, n- size of array, i- root node index
		
		System.out.println("Array - ");
		display(arr);
		
		System.out.println("At root node index-"+i);
		System.out.println("At root node value-"+arr[i]);
		
		int largest = i;
		int l = (2*i)+1;
		int r = (2*i)+2;
		
		
		if(l<n && arr[l]>=arr[largest]){
			largest = l;
			
		}
		
		
		if(r<n && arr[r]>=arr[largest]){
			largest = r;
			
		}
		
		
		if(arr[largest]!= arr[i]){
			
			System.out.println("Swapping values "+arr[largest]+" and "+arr[i]);
			
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr,n,largest);
		}
				
		
	}
	
	


	public static void display(int[] itemList) {
		for(int x :itemList) {
			System.out.print(x+",");
		}
		System.out.println();
		
	}

}
