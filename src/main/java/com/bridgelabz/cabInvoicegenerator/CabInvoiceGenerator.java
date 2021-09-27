package com.bridgelabz.cabInvoicegenerator;

/**
 * @author tushar.kasturi_ymedi
 */
public class CabInvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private double MINIMUM_COST_PER_KILOMETER = 10.0;

	public double calculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
	}
}
