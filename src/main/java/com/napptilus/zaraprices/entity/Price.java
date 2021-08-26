package com.napptilus.zaraprices.entity;

import java.util.Date;

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
	private Date startDate;
	
	@Id
	private Date endDate;
	
	private Integer priceList;
	
	private Float price;
	
	private String curr;
	
	private Date lastUpdate;
	
	private String lastUpdateBy;
}
