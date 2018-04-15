package com.DS;

public class Array2D {

	//Find words with all characters matching the masterWord
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String masterWord = "Pool";
		
		String[] trialWords = {"Lopoo","Loop","Beach","Nest","Opol","OOLP","Rubal","Tanya"};	
			
		for(String trialWord:trialWords) {
			//Go through each word
			
			//System.out.println("Checking - "+trialWord);
			
			if(compareWordChars(masterWord.toCharArray(),trialWord.toCharArray()) && (masterWord.toCharArray().length == trialWord.toCharArray().length)) {
				 System.out.println(trialWord);
			 }
			
		}
		

	}
	
	
	
	private static boolean compareWordChars(char[] masterWordChars, char[] trialWordChars) {
		boolean checkFlag = false;
		
		
		Integer[] indexMarker= new Integer[masterWordChars.length];
		int i=-1;
		for(char masterWordChar:masterWordChars) {//Loop for masterWordChar
			i++;

			for(int j=0;j<trialWordChars.length;j++) {//Loop for trialWordChars
				
				//System.out.println("Comparing "+masterWordChar+" with"+trialWordChars[j]);
				
				if(Character.toString(masterWordChar).compareToIgnoreCase(Character.toString(trialWordChars[j])) == 0
						&& !doesContain(indexMarker,j)
						){
					indexMarker[i]= new Integer(j);
					
					break; //only takes you out of the inner loop
				}
							
			}//end Loop for trialWordChars
			
			if(indexMarker[i] == null) {

				checkFlag = false;
				break;
			}else {

				checkFlag = true;
			}
		}//end Loop for masterWordChar
		
		return checkFlag;
	}
	
	
	
	private static boolean doesContain(Integer[] myArray, int key) {
		
		boolean contains = false;

		
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i] != null && key == myArray[i]) {
				contains = true;
				break;
			}
		}
		
		
		return contains;
		
	}

}
