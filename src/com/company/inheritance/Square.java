package com.company.inheritance;

public class Square extends Quadilateral {
	
	public Square(double side) {
		super(side, side);
	}
	
	public static void main(String args[]) {
		Square square = new Square(5);
		System.out.println("Area: " + square.area());
	}

}
