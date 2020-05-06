package com.company.inheritance;

public abstract class Quadilateral {
	protected double height;
	protected double width;

	public Quadilateral(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double area() {
		return height * width;
	}

}
