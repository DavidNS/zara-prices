package com.napptilus.zaraprices.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PricesOutDTOTest {

	@Test
	void testConstructorAllArgs() {
		PricesOutDTO instance=new PricesOutDTO(1, 1, 1, new Date(), new Date(), 1.0F);
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
		PricesOutDTO instance=new PricesOutDTO(expected, 0, 0, new Date(), new Date(), 0.0F);
		assertEquals(expected, instance.getBrandId());
	}

	@Test
	void testGetProductId() {
		Integer expected=1;
		PricesOutDTO instance=new PricesOutDTO(0, expected, 0, new Date(), new Date(), 0.0F);
		assertEquals(expected, instance.getProductId());
	}

	@Test
	void testGetPriceList() {
		Integer expected=1;
		PricesOutDTO instance=new PricesOutDTO(0, 0, expected, new Date(), new Date(), 0.0F);
		assertEquals(expected, instance.getPriceList());
	}

	@Test
	void testGetStartDate() {
		Date expected=new Date();
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, expected, new Date(), 0.0F);
		assertEquals(expected, instance.getStartDate());
	}

	@Test
	void testGetEndDate() {
		Date expected=new Date();
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, new Date(), expected, 0.0F);
		assertEquals(expected, instance.getEndDate());
	}

	@Test
	void testGetPrice() {
		Float expected=1.0F;
		PricesOutDTO instance=new PricesOutDTO(0, 0, 0, new Date(), new Date(),expected);
		assertEquals(expected, instance.getPrice());
	}



}
