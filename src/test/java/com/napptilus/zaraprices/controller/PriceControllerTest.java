package com.napptilus.zaraprices.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.napptilus.zaraprices.service.PriceService;

@ExtendWith(MockitoExtension.class)
class PriceControllerTest {


	@Mock
	private PriceService pricesService;
	
	@InjectMocks
	private PriceController instance;

	@Test
	void constructor() {
		assertNotNull(instance);
	}
	
	@Test
	void testGetPrices() {
		assertNull(instance.getPrices(null));
	}

}
