package com.napptilus.zaraprices.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.napptilus.zaraprices.dto.PricesInDTO;
import com.napptilus.zaraprices.dto.PricesOutDTO;
import com.napptilus.zaraprices.entity.Price;
import com.napptilus.zaraprices.exception.NoSuchElementFoundException;
import com.napptilus.zaraprices.repository.PriceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceService {

	private static final String NOT_FOUND_ELEMENT_WITH_THESE_VALUES_IN_DATABASE = "Not found element with these values in database";
	
	private final PriceRepository pricesRepository;

	public PricesOutDTO getPrices(@RequestBody PricesInDTO pricesInDto) throws NoSuchElementFoundException {
		List<Price> prices = pricesRepository
				.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
						pricesInDto.getBrandId(), pricesInDto.getProductId(), pricesInDto.getApplicationDate(),
						pricesInDto.getApplicationDate());
		if (prices != null && prices.size() > 0) {
			return priceEntityToPriceOutDTO(prices.get(0));
		}
		throw new NoSuchElementFoundException(NOT_FOUND_ELEMENT_WITH_THESE_VALUES_IN_DATABASE);
	}

	private PricesOutDTO priceEntityToPriceOutDTO(Price prices) {
		return new PricesOutDTO(prices.getBrandId(), prices.getProductId(), prices.getPriceList(),
				prices.getStartDate(), prices.getEndDate(), prices.getPrice());
	}

}
