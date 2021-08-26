package com.napptilus.zaraprices.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PricesInDTO {

	@NotNull(message = "brandId is mandatory")
	private Integer brandId;
	
	@NotNull(message = "productId is mandatory")
	private Integer productId;
	
	@NotNull(message = "applicationDate is mandatory")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime applicationDate;
	
}
