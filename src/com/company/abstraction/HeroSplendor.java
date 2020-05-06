package com.company.abstraction;

public class HeroSplendor implements Bike {
	
	private static int TOP_GEAR = 4;
	private static int TOP_SPEED = 80;
	
	private int speed;
	private int gear;

	public void start() {
		speed = 0;
		gear = 0;
	}

	public void stop() {
		speed = 0;
	}

	public void increaseGear() {
		gear++;
		if (gear > TOP_GEAR) {
			gear = TOP_GEAR;
		}
	}

	public void decreaseGear() {
		gear--;
		if (gear < 0) {
			gear = 0;
		}
	}

	public void accelerate() {
		speed += 10;
		if (speed > TOP_SPEED) {
			speed = TOP_SPEED;
		}
	}

	public void brake() {
		speed -= 10;
		if (speed < 0) {
			speed = 0;
		}
	}
	
	public String toString() {
		return "Splendor running at " + speed + "Km/h on gear " + gear + ".";
	}

}
