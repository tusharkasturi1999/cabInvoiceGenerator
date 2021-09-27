package com.bridgelabz.cabInvoicegenerator;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = CabInvoiceGenerator.calculateFare("premium", distance, time);
		assertEquals(40, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTimeLessThanMinimumShouldReturnMinimum() {
		double distance = 0.25;
		int time = 1;
		double fare = CabInvoiceGenerator.calculateFare("normal", distance, time);
		assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenMultipleRide_ShouldReturnInvoiceSummary() {
		Ride[] user1rides = { new Ride(2.0, 5), new Ride(0.1, 1), new Ride(2, 10) };
		Ride[] user2rides = { new Ride(3.0, 5), new Ride(0.1, 2) };
		Ride[] user3rides = { new Ride(2.0, 10), new Ride(0.1, 1) };
		Map<Integer, Ride[]> rideRepository = new HashMap<>();
		rideRepository.put(101, user1rides);
		rideRepository.put(102, user2rides);
		rideRepository.put(103, user3rides);
		int userID = 101;
		String rideCategory = "normal";
		InvoiceSummary summary = CabInvoiceGenerator.calculateFare(rideCategory, rideRepository.get(userID));
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 60.0);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

	@Test
	public void givenMultipleRide_ShouldReturnInvoiceSummaryForPremiumRides() {
		Ride[] user1rides = { new Ride(2.0, 5), new Ride(0.1, 1), new Ride(2, 10) };
		Ride[] user2rides = { new Ride(3.0, 5), new Ride(0.1, 2) };
		Ride[] user3rides = { new Ride(2.0, 10), new Ride(0.1, 1) };
		Map<Integer, Ride[]> rideRepository = new HashMap<>();
		rideRepository.put(101, user1rides);
		rideRepository.put(102, user2rides);
		rideRepository.put(103, user3rides);
		int userID = 101;
		String rideCategory = "premium";
		InvoiceSummary summary = CabInvoiceGenerator.calculateFare(rideCategory, rideRepository.get(userID));
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 110.0);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
