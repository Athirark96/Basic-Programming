package com.ilpbatch4.utility;

public class DescOrder {

	public static void main(String[] args) {
		int input1 = 40, input2 = 60, input3 = 100;
		descNumber(input1, input2, input3);
	}
	private static void descNumber(int input1, int input2, int input3) {
		if (input1 >= input2 && input1 >= input3) {
			if (input2 >= input3) {
				System.out.println(input1 + " " + input2 + " " + input3);
			}
			if (input3 >= input2) {
				System.out.println(input1 + " " + input3 + " " + input2);
			}
		}
		if (input2 >= input1 && input2 >= input3) {
			if (input1 >= input3) {
				System.out.println(input2 + " " + input1 + " " + input3);
			}
			if (input3 >= input1) {
				System.out.println(input2 + " " + input3 + " " + input1);
			}
		}
		if (input3 >= input1 && input3 >= input2) {
			if (input1 >= input2) {
				System.out.println(input3 + " " + input1 + " " + input2);
			}
			if (input2 >= input1) {
				System.out.println(input3 + " " + input2 + " " + input1);
			}
		}
	}
}
