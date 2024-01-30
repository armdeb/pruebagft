package com.inditex.demo.prices.adaptadores.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceFacade priceFacade;

    @GetMapping
    private ResponseEntity<PriceResponse> getPreferredPrice(
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam("applyDate") LocalDateTime applyDate,
            @RequestParam("productId") @NonNull Integer productId,
            @RequestParam("brandId") @NonNull Integer brandId) {
        try {
            PriceResponse response = priceFacade.getPreferredPrice(applyDate, productId, brandId);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
