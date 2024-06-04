package com.ilpbatch4.utility;

public class ArraySort {

	public static void main(String[] args) {
		int array[] = { 1, 0, 1, 2, 0, 0, 2, 1,2 ,3,4,6,7,1,2};
		sortArray(array);
		//System.out.println(array.length);
	}

	private static void sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if(array[i]<=2)
				{
//					System.out.println(array[i]);
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
					
				
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i]<=2)
				System.out.println(array[i]);
		}
	}
}
