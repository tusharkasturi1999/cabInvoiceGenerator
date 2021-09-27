package com.bridgelabz.cabInvoicegenerator;

/**
 * @author tushar.kasturi_ymedi
 */
public class CabInvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private double MINIMUM_COST_PER_KILOMETER = 10.0;
	private double MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if(totalFare<MINIMUM_FARE) {
			return MINIMUM_FARE;
		}
		else {
			return totalFare;
		}
	}
}
