package com.napptilus.zaraprices.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity
@Data
@IdClass(PriceID.class)
public class Price {

	@Id
	private Integer brandId;
	
	@Id
	private Integer productId;
	
	@Id
	private Integer priority;
	
	@Id
	private LocalDateTime startDate;
	
	@Id
	private LocalDateTime endDate;
	
	private Integer priceList;
	
	private Float price;
	
	private String curr;
	
	private LocalDateTime lastUpdate;
	
	private String lastUpdateBy;
}
