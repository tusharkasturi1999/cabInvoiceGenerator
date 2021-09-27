package com.bridgelabz.cabInvoicegenerator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class cabInvoiceGeneratorTest 
{
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance,time);
		assertEquals(25,fare,0.0);
	}
}
