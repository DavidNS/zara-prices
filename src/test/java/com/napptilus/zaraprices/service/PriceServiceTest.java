package com.napptilus.zaraprices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.napptilus.zaraprices.dto.PricesInDTO;
import com.napptilus.zaraprices.dto.PricesOutDTO;
import com.napptilus.zaraprices.entity.Price;
import com.napptilus.zaraprices.exception.NoSuchElementFoundException;
import com.napptilus.zaraprices.repository.PriceRepository;

@ExtendWith(MockitoExtension.class)
class PriceServiceTest {

	@Mock
	private PriceRepository priceRepository;

	@InjectMocks
	private PriceService instance;

	@Test
	void constructor() {
		assertNotNull(instance);
	}

	@Test
	void testGetPricesNullDTO() {
		assertThrows(NullPointerException.class, () -> {
			instance.getPrices(null);
		});
	}

	@Test
	void testGetPricesRepositoryGivesNull() {
		assertThrows(NoSuchElementFoundException.class, () -> {
			instance.getPrices(new PricesInDTO());
		});
	}

	@Test
	void testGetPricesRepositoryGivesEmpty() {
		when(priceRepository
				.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(
						Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(new ArrayList<>());
		assertThrows(NoSuchElementFoundException.class, () -> {
			instance.getPrices(new PricesInDTO());
		});
	}
	
	@Test
	void testGetPricesRepositoryGivesOne() {
		Integer expected=1;
		
		ArrayList<Price> repositoryResults=new ArrayList<>();
		Price price=new Price();
		
		price.setBrandId(expected);
		repositoryResults.add(price);
		
		when(priceRepository
				.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(
						Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(repositoryResults);
		PricesOutDTO result=instance.getPrices(new PricesInDTO());
		assertEquals(expected, result.getBrandId());
	}
	
	@Test
	void testGetPricesRepositoryGivesTwo() {
		Integer expected=1;
		Integer other=2;
		
		ArrayList<Price> repositoryResults=new ArrayList<>();
		
		Price price1=new Price();
		price1.setBrandId(expected);
		
		Price price2=new Price();
		price2.setBrandId(other);
		
		repositoryResults.add(price1);
		repositoryResults.add(price2);
		
		when(priceRepository
				.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(
						Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(repositoryResults);
		PricesOutDTO result=instance.getPrices(new PricesInDTO());
		assertEquals(expected, result.getBrandId());
	}
	

}
