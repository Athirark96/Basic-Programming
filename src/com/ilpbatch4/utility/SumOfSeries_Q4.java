package com.ilpbatch4.utility;

public class SumOfSeries_Q4 {

	public static void main(String[] args) {
		int input = 5;
		seriesSum(input);
	}
	private static void seriesSum(int input) {
		int variable1=0;
		int variable2=1;
		int variable3;
		int sum = 0;
		int product;
		for (int i = 1; i < input; i++) {
			variable3 = variable1 + variable2;
			variable1 = variable2;
			variable2= variable3;
			product = variable3 * variable3 * variable3;
			sum = sum + product;
		}
		System.out.println(sum);
	}
}
