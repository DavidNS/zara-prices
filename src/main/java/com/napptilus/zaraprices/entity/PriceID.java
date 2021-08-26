package com.napptilus.zaraprices.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class PriceID implements Serializable {

	private static final long serialVersionUID = -7167362323433000505L;

	private Integer brandId;
	
	private Integer productId;
	
	private Integer priority;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
}
