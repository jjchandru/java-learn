package com.company.inheritance;

public class Trapezium extends Quadilateral {
	
	public Trapezium(double baseA, double baseB, double height) {
		super((baseA + baseB) / 2, height);
	}
	
	public static void main(String args[]) {
		Trapezium trapezium = new Trapezium(25, 35, 10);
		System.out.println("Area: " + trapezium.area());
	}
}
