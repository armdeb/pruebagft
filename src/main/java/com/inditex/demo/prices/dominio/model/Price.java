package com.inditex.demo.prices.dominio.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PRICES", indexes = @Index(columnList = "productId, brandId, startDate, endDate, priority DESC"))
public class Price {

    @Id
    @Column(name = "PRICE_LIST")
    private Integer priceList;
    @Column(name = "PRODUCT_ID")
    private Integer productId;
    @Column(name = "BRAND_ID")
    private Integer brandId;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Enumerated(EnumType.STRING)
    @Column(name = "CURR")
    private Currency currency;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
}
