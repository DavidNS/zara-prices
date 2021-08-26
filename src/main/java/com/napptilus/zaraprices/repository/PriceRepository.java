package com.napptilus.zaraprices.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.napptilus.zaraprices.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Integer> {

	List<Price> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(Integer brandID,
			Integer productID, LocalDateTime startDate,LocalDateTime endDate);

}
