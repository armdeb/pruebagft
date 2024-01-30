package com.inditex.demo.prices.dominio.puertos.repository;

import com.inditex.demo.prices.dominio.model.Price;

import java.time.LocalDateTime;

public interface PriceRepository {

    Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId);
}
