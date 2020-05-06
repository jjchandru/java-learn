package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;

public class AverageCalculator {
	
	public static void main(String args[]) {
		ArrayList<Double> scores = new ArrayList<>();
		scores.add(48.0);
		scores.add(55.0);
		scores.add(92.0);
		scores.add(78.0);
		scores.add(64.0);
		System.out.println("Scores: " + scores);

		scores.remove(92.0);
		System.out.println("Scores: " + scores);
		
		scores.add(1, 92.0);
		System.out.println("Scores: " + scores);
		
		System.out.println("Third item: " + scores.get(2));
		
		System.out.println("Sorting the list...");
		Collections.sort(scores);
		System.out.println("Scores: " + scores);
		
		System.out.println("Reverse sorting the list...");
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println("Scores: " + scores);
		
		double total = 0;
		for (double score : scores) {
			total += score;
		}
		double average = total / scores.size();
		System.out.println("Average Score is: " + average);
	}

}

/*
System.out.println(scores.get(0));
Collections.sort(scores, Collections.reverseOrder());
*/