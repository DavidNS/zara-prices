package com.napptilus.zaraprices.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class PricesOutDTOTest {

	@Test
	void testConstructorAllArgs() {
		PricesOutDTO instance=new PricesOutDTO(1, 1, 1, LocalDateTime.now(), LocalDateTime.now(), 1.0F);
		assertNotNull(instance);
	}

	@Test
	void testConstructorNoArgs() {
		PricesOutDTO instance=new PricesOutDTO();
		assertNotNull(instance);
	}
	
	
	@Test
	void testGetBrandId() {
		Integer expected=1;
		PricesOutDTO instance=new PricesOutDTO(expected, 0, 0, LocalDateTime.now(), LocalDateTime.now(), 0.0F);
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		Integer expected=1;
		PricesOutDTO instance=new PricesOutDTO(0, expected, 0, LocalDateTime.now(), LocalDateTime.now(), 0.0F);
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testGetPriceList() {
		Integer expected=1;
		PricesOutDTO instance=new PricesOutDTO(0, 0, expected, LocalDateTime.now(), LocalDateTime.now(), 0.0F);
		assertEquals(expected, instance.getPriceList());
	}

	@Test
	void testGetStartDate() {
		LocalDateTime expected=LocalDateTime.now();
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, expected, LocalDateTime.now(), 0.0F);
		assertEquals(expected, instance.getStartDate());
	}

	@Test
	void testGetEndDate() {
		LocalDateTime expected=LocalDateTime.now();
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, LocalDateTime.now(), expected, 0.0F);
		assertEquals(expected, instance.getEndDate());
	}

	@Test
	void testGetPrice() {
		Float expected=1.0F;
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, LocalDateTime.now(), LocalDateTime.now(),expected);
		assertEquals(expected, instance.getPrice());
	}



}
