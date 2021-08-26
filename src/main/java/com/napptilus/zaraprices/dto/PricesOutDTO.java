package com.napptilus.zaraprices.dto;

import java.util.Date;

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
	
	private Date startDate;
	
	private Date endDate;
	
	private Float price;
}
