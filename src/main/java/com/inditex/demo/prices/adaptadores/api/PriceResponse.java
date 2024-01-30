package com.inditex.demo.prices.adaptadores.api;

import com.inditex.demo.prices.dominio.model.Price;

import java.time.LocalDateTime;

public record PriceResponse(Integer productId, Integer brandId, Integer priceList, LocalDateTime startDate,
                            LocalDateTime endDate, Double price) {

    public PriceResponse(Price price) {

        this(price.getProductId(), price.getBrandId(), price.getPriceList(), price.getStartDate(), price.getEndDate(),
                price.getPrice());
    }
}
