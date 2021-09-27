package com.bridgelabz.cabInvoicegenerator;

/**
 * @author tushar.kasturi_ymedi
 */
public class CabInvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
	private static final double MINIMUM_FARE = 5;

	public static double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	return Math.max(totalFare, MINIMUM_FARE);
	}
	
	public static double calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride:rides) {
			totalFare += calculateFare(ride.distance,ride.time);
		}
		return totalFare;
	}
}
