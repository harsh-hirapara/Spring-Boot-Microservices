package com.fruitprice.fruit_month_price_service;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FruitPriceEntity {

    @Id
    private Long id;

    @Column(name = "fruit")
    private String fruit;

    @Column(name = "month_col")
    private String month;

    @Column(name = "fmp")
    private BigDecimal fmp;

    @Column(name = "environment")
    private String environment;

    public FruitPriceEntity() {}

    public FruitPriceEntity(Long id, String fruit, String month, BigDecimal fmp) {
        super();
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.fmp= fmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getFmp() {
        return fmp;
    }

    public void setFmp(BigDecimal fmp) {
        this.fmp = fmp;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}

