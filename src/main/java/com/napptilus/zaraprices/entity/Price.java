package com.napptilus.zaraprices.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Price {
	
	@Id
	private Integer id;
	
	private Integer brandId;
	
	private Integer productId;

	private Integer priority;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private Integer priceList;
	
	private Float price;
	
	private String curr;
	
	private LocalDateTime lastUpdate;
	
	private String lastUpdateBy;
}
