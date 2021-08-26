package com.napptilus.zaraprices.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class PricesInDTOTest {

	@Test
	void constructorAllArgs() {
		PricesInDTO instance=new PricesInDTO(0,0,LocalDateTime.now());
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
		PricesInDTO instance=new PricesInDTO(expected,0,LocalDateTime.now());
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		Integer expected=1;
		PricesInDTO instance=new PricesInDTO(0,expected,LocalDateTime.now());
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testGetApplicationDate() {
		LocalDateTime expected=LocalDateTime.now();
		PricesInDTO instance=new PricesInDTO(0,0,expected);
		assertEquals(expected, instance.getApplicationDate());
	}



}
