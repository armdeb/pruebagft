package com.inditex.demo.prices.adaptadores.api;

import com.inditex.demo.prices.dominio.model.Price;
import com.inditex.demo.prices.dominio.puertos.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PriceFacadeImpl implements PriceFacade {

    @Autowired
    private PriceService priceService;

    public PriceResponse getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId) {
        // aqui faltaria un bloque try catch con responsentity para manejar las excepciones
        Price price = priceService.getPreferredPrice(applyDate, productId, brandId);

        if (price != null) {
            return new PriceResponse(price);
        }

        return null;
    }
}
