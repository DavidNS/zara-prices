package com.napptilus.zaraprices.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PricesInDTOTest {

	@Test
	void constructorAllArgs() {
		PricesInDTO instance=new PricesInDTO(0,0,new Date());
		assertNotNull(instance);
	}

	@Test
	void constructorNoArgs() {
		PricesInDTO instance=new PricesInDTO();
		assertNotNull(instance);
	}
	
	@Test
	void testGetBrandId() {
		Integer expected=1;
		PricesInDTO instance=new PricesInDTO(expected,0,new Date());
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		Integer expected=1;
		PricesInDTO instance=new PricesInDTO(0,expected,new Date());
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testGetApplicationDate() {
		Date expected=new Date();
		PricesInDTO instance=new PricesInDTO(0,0,expected);
		assertEquals(expected, instance.getApplicationDate());
	}



}
