package com.inditex.demo.prices.dominio.puertos.service;

import com.inditex.demo.prices.dominio.model.Price;

import java.time.LocalDateTime;

public interface PriceService {

    Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId);
}
