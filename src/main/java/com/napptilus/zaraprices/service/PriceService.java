package com.napptilus.zaraprices.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.napptilus.zaraprices.dto.PricesInDTO;
import com.napptilus.zaraprices.dto.PricesOutDTO;
import com.napptilus.zaraprices.entity.Prices;
import com.napptilus.zaraprices.exception.NoSuchElementFoundException;
import com.napptilus.zaraprices.repository.PriceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceService {

	private final PriceRepository pricesRepository;

	public PricesOutDTO getPrices(@Validated @RequestBody PricesInDTO pricesInDto) {
		List<Prices> prices = pricesRepository
				.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(
						pricesInDto.getBrandId(), pricesInDto.getProductId(), pricesInDto.getApplicationDate(),
						pricesInDto.getApplicationDate());
		if (prices.size() > 1) {
			return priceEntityToPriceOutDTO(prices.get(0));
		}
		throw new NoSuchElementFoundException("Not found element related in prices database");
	}

	private PricesOutDTO priceEntityToPriceOutDTO(Prices prices) {
		return new PricesOutDTO(prices.getBrandId(), prices.getProductId(), prices.getPriceList(),
				prices.getStartDate(), prices.getEndDate(), prices.getPrice());
	}

}
