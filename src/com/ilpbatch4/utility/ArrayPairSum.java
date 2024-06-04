package com.ilpbatch4.utility;

public class ArrayPairSum {

	public static void main(String[] args) {
		int array[] = { 2,4,5,1,3,3,6};
		int number = 6;
		arrayPair(array, number);
	}
	private static void arrayPair(int[] array, int number) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == 6) {
					count++;
				}
			}
		}
		System.out.println("Number of Pair : " + count);
	}
}
