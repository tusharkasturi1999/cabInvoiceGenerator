package com.bridgelabz.cabInvoicegenerator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class cabInvoiceGeneratorTest {
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTimeLessThanMinimumShouldReturnMinimum() {
		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double distance = 0.25;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}
}
