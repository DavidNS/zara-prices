package com.napptilus.zaraprices.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.napptilus.zaraprices.entity.Prices;
import com.napptilus.zaraprices.entity.PricesID;

public interface PriceRepository extends JpaRepository<Prices, PricesID> {

	List<Prices> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityAsc(Integer brandID,
			Integer productID, Date startDate,Date endDate);

}
