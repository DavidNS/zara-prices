package com.napptilus.zaraprices.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PricesOutDTO {

	private Integer brandId;
	
	private Integer productId;
	
	private Integer priceList;
	
	@JsonFormat( shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime startDate;
	
	@JsonFormat( shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime endDate;
	
	private Float price;
}
