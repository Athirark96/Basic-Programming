package com.ilpbatch4.utility;

public class DuplicateNumberArray {

	public static void main(String[] args) {
		int array[]= {1,3,2,1,3,2,7};
		arrayDuplicate(array);
	}
	private static void arrayDuplicate(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {	
					System.out.println(array[i]);
				}
			}
		}	
	}
}
