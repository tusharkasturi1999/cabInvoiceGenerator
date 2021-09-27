package com.bridgelabz.cabInvoicegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = CabInvoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTimeLessThanMinimumShouldReturnMinimum() {
		double distance = 0.25;
		int time = 1;
		double fare = CabInvoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenMultipleRide_ShouldReturnTotalFare() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		double fare = CabInvoiceGenerator.calculateFare(rides);
		Assert.assertEquals(30, fare, 0.0);
	}
}
