package com.napptilus.zaraprices.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.napptilus.zaraprices.dto.PricesInDTO;
import com.napptilus.zaraprices.dto.PricesOutDTO;
import com.napptilus.zaraprices.service.PriceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path =  "/prices")
@RequiredArgsConstructor
public class PriceController {
	
	private final PriceService pricesService;
	
	@GetMapping
	public PricesOutDTO getPrices(@Validated @RequestBody PricesInDTO pricesInDto) {
		return pricesService.getPrices(pricesInDto);
	}

}
