package com.napptilus.zaraprices.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class PriceTest {

	@Test
	void constructor() {
		Price instance=new Price();
		assertNotNull(instance);
	}
	
	@Test
	void testGetId() {
		Price instance=new Price();
		assertNull(instance.getId());
	}
	
	
	@Test
	void testGetBrandId() {
		Price instance=new Price();
		assertNull(instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		Price instance=new Price();
		assertNull(instance.getProductId());
	}

	@Test
	void testGetPriority() {
		Price instance=new Price();
		assertNull(instance.getPriority());
	}

	@Test
	void testGetStartDate() {
		Price instance=new Price();
		assertNull(instance.getStartDate());
	}

	@Test
	void testGetEndDate() {
		Price instance=new Price();
		assertNull(instance.getEndDate());
	}

	@Test
	void testGetPriceList() {
		Price instance=new Price();
		assertNull(instance.getPriceList());
	}

	@Test
	void testGetPrice() {
		Price instance=new Price();
		assertNull(instance.getPrice());
	}

	@Test
	void testGetCurr() {
		Price instance=new Price();
		assertNull(instance.getCurr());
	}

	@Test
	void testGetLastUpdate() {
		Price instance=new Price();
		assertNull(instance.getLastUpdate());
	}

	@Test
	void testGetLastUpdateBy() {
		Price instance=new Price();
		assertNull(instance.getLastUpdateBy());
	}

	@Test
	void testSetId() {
		Integer expected=1;
		Price instance=new Price();
		instance.setId(expected);
		assertEquals(expected, instance.getId());
	}
	
	@Test
	void testSetBrandId() {
		Integer expected=1;
		Price instance=new Price();
		instance.setBrandId(expected);
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testSetProductId() {
		Integer expected=1;
		Price instance=new Price();
		instance.setProductId(expected);
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testSetPriority() {
		Integer expected=1;
		Price instance=new Price();
		instance.setPriority(expected);
		assertEquals(expected, instance.getPriority());
	}

	@Test
	void testSetStartDate() {
		LocalDateTime expected=LocalDateTime.now();
		Price instance=new Price();
		instance.setStartDate(expected);
		assertEquals(expected, instance.getStartDate());
	}

	@Test
	void testSetEndDate() {
		LocalDateTime expected=LocalDateTime.now();
		Price instance=new Price();
		instance.setEndDate(expected);
		assertEquals(expected, instance.getEndDate());
	}

	@Test
	void testSetPriceList() {
		Integer expected=1;
		Price instance=new Price();
		instance.setPriceList(expected);
		assertEquals(expected, instance.getPriceList());
	}

	@Test
	void testSetPrice() {
		Float expected=1.0F;
		Price instance=new Price();
		instance.setPrice(expected);
		assertEquals(expected, instance.getPrice());
	}

	@Test
	void testSetCurr() {
		String expected="EUR";
		Price instance=new Price();
		instance.setCurr(expected);
		assertEquals(expected, instance.getCurr());
	}

	@Test
	void testSetLastUpdate() {
		LocalDateTime expected=LocalDateTime.now();
		Price instance=new Price();
		instance.setLastUpdate(expected);
		assertEquals(expected, instance.getLastUpdate());
	}

	@Test
	void testSetLastUpdateBy() {
		String expected="Ackbar";
		Price instance=new Price();
		instance.setLastUpdateBy(expected);
		assertEquals(expected, instance.getLastUpdateBy());
	}



}
