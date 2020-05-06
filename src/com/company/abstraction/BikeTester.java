package com.company.abstraction;

public class BikeTester {
	
	public static void main(String args[]) {
		Bike splendor = new HeroSplendor();
		Bike fatBoy = new HarleyDavidsonFatBoy();
		
		splendor.start();
		fatBoy.start();
		
		for (int i = 0; i < 10; i++) {
			splendor.increaseGear();
			splendor.accelerate();
			
			fatBoy.increaseGear();
			fatBoy.accelerate();

			System.out.println(splendor + "   " + fatBoy);
		}
		
		splendor.stop();
		fatBoy.stop();
	}

}

