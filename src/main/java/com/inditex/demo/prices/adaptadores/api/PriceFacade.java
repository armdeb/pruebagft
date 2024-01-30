package com.inditex.demo.prices.adaptadores.api;

import java.time.LocalDateTime;

public interface PriceFacade {

    PriceResponse getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId);
}
