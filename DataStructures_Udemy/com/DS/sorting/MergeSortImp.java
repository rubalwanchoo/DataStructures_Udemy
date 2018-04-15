package com.DS.sorting;


public class MergeSortImp{
	
	
	public static void main(String args[]) {
		int[] array = {9,8,7,6,5,4,3,2,1};
		
		System.out.println("Array Before Sort -");
		display(array);
		
		mergeSort(array, 0, array.length-1);
		
		System.out.println("Array After Sort -");
		display(array);
	}
	
	
	
	public static void mergeSort(int[] array,int l, int r) {
		
		
		if(l<r) {
			
			int m = (l+r)/2;
			System.out.println("In mergeSort l-"+l+" m-"+m+" r-"+r);
			
			mergeSort(array, l, m);
			mergeSort(array, m+1,r);
			
			merge(array, l,m,r);
		}

	}
	
	public static void merge(int[] array, int l, int m, int r) {
		
		//Split the array into two halves
		
		int LArrayN = m-l+1;
		int RArrayN = r-m;
		
		int[] LArray = new int[LArrayN];
		int[] RArray = new int[RArrayN];
		
		//Populate LArray
		for(int i = 0;i<LArrayN;i++) {
			
			LArray[i]= array[l+i];
		}
		
		System.out.println("LArray-");
		display(LArray);
		
		//Populate RArray
		for(int i = 0;i<RArrayN;i++) {
			
			RArray[i]= array[m+i+1];
		}
		
		System.out.println("RArray-");
		display(RArray);
		
		
		int i = 0;
		int j = 0;
		int k = l;
		
		//Compare items from two sub arrays
		while(i<LArrayN && j<RArrayN) {
			System.out.println("Comparing "+LArray[i]+" with "+RArray[j]);
			
			if(LArray[i]<RArray[j]) {
				System.out.println("Assigning "+LArray[i]+" which is less than "+RArray[j]);
				array[k] = LArray[i];
				i++;
				
			}
			else if(RArray[j]<LArray[i]){
				System.out.println("Assigning "+RArray[j]+" which is less than "+LArray[i]);
				array[k] = RArray[j];
				j++;
			}
			
			k++;
		}
		
		//Taking left over items from left array
		while(i<LArrayN) {
			System.out.println("Taking leftover item "+LArray[i]+" from LeftArray");
			array[k] = LArray[i];
			i++;
			k++;
		}
		
		//Taking left over items from right array
		while(j<RArrayN) {
			System.out.println("Taking leftover item "+RArray[j]+" from RightArray");
			array[k] = RArray[j];
			j++;
			k++;
		}
		
		System.out.println("After merge with array-");
		display(array);
	
	}
	
	

	public static void display(int[] itemList) {
		for(int x :itemList) {
			System.out.print(x+",");
		}
		System.out.println();
		
	}
	
}






