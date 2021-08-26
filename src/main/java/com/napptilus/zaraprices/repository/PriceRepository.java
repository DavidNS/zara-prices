package com.napptilus.zaraprices.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.napptilus.zaraprices.entity.Price;
import com.napptilus.zaraprices.entity.PriceID;

public interface PriceRepository extends JpaRepository<Price, PriceID> {

	List<Price> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(Integer brandID,
			Integer productID, Date startDate,Date endDate);

}
