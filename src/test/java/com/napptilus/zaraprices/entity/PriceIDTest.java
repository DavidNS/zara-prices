package com.napptilus.zaraprices.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PriceIDTest {

	@Test
	void constructor() {
		PriceID instance=new PriceID();
		assertNotNull(instance);
	}
	
	@Test
	void testGetBrandId() {
		PriceID instance=new PriceID();
		assertNull(instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		PriceID instance=new PriceID();
		assertNull(instance.getProductId());
	}

	@Test
	void testGetPriority() {
		PriceID instance=new PriceID();
		assertNull(instance.getPriority());
	}

	@Test
	void testGetStartDate() {
		PriceID instance=new PriceID();
		assertNull(instance.getStartDate());
	}

	@Test
	void testGetEndDate() {
		PriceID instance=new PriceID();
		assertNull(instance.getEndDate());
	}

	@Test
	void testSetBrandId() {
		Integer expected=1;
		PriceID instance=new PriceID();
		instance.setBrandId(expected);
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testSetProductId() {
		Integer expected=1;
		PriceID instance=new PriceID();
		instance.setProductId(expected);
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testSetPriority() {
		Integer expected=1;
		PriceID instance=new PriceID();
		instance.setPriority(expected);
		assertEquals(expected, instance.getPriority());
	}

	@Test
	void testSetStartDate() {
		Date expected=new Date();
		PriceID instance=new PriceID();
		instance.setStartDate(expected);
		assertEquals(expected, instance.getStartDate());
	}

	@Test
	void testSetEndDate() {
		Date expected=new Date();
		PriceID instance=new PriceID();
		instance.setEndDate(expected);
		assertEquals(expected, instance.getEndDate());
	}



}
