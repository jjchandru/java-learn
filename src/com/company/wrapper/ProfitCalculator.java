package com.company.wrapper;

public class ProfitCalculator {

	public static void main(String args[]) {
		Integer buyingPrice = 15;
		Integer sellingPrice = 25;
		Integer profit = sellingPrice - buyingPrice;
		System.out.println("Profit = " + profit);
		
		Integer i = Integer.valueOf(10);
		Integer j = Integer.valueOf(10);
		System.out.println(i == j);
	}
}

