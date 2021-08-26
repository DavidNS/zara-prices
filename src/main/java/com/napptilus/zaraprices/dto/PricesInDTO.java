package com.napptilus.zaraprices.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PricesInDTO {

	@NotNull(message = "BrandId is mandatory")
	private Integer brandId;
	
	@NotNull(message = "productId is mandatory")
	private Integer productId;
	
	@NotNull(message = "applicationDate is mandatory")
	private Date applicationDate;
	
}
