package com.inditex.demo.prices.adaptadores.database;

import com.inditex.demo.prices.dominio.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceJPARepository extends JpaRepository<Price, Integer> {

    Price findTopByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
            Integer productId, Integer brandId, LocalDateTime apply, LocalDateTime app2
                                                                                       );
}
