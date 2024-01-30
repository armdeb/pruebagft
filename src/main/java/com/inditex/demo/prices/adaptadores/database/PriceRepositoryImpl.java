package com.inditex.demo.prices.adaptadores.database;

import com.inditex.demo.prices.dominio.model.Price;
import com.inditex.demo.prices.dominio.puertos.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PriceRepositoryImpl implements PriceRepository {

    @Autowired
    private PriceJPARepository priceJPARepository;
    @Override
    public Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId) {

        return priceJPARepository.findTopByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
                productId, brandId, applyDate, applyDate
        );
    }
}
