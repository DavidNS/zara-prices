package com.napptilus.zaraprices.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class PricesID implements Serializable {

	private Integer brandId;
	
	private Integer productId;
	
	private Integer priority;
	
	private Date startDate;
	
	private Date endDate;
	
}
