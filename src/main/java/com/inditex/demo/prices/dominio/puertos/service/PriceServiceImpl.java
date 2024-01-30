package com.inditex.demo.prices.dominio.puertos.service;

import com.inditex.demo.prices.dominio.model.Price;
import com.inditex.demo.prices.dominio.puertos.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;

    @Autowired
    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId) {

        return priceRepository.getPreferredPrice(applyDate, productId, brandId);
    }
}
