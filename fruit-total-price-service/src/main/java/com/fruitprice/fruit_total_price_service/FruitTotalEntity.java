package com.fruitprice.fruit_total_price_service;

import java.math.BigDecimal;

public class FruitTotalEntity {
    private Long id;
    private String fruit;
    private String month;
    private BigDecimal quantity;
    private BigDecimal fmp;
    private BigDecimal totalPrice;
    private String environment;

    public FruitTotalEntity(Long id, String fruit, String month, BigDecimal quantity, BigDecimal fmp, BigDecimal totalPrice, String environment) {
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.quantity = quantity;
        this.fmp = fmp;
        this.totalPrice = totalPrice;
        this.environment = environment;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getFmp() {
        return fmp;
    }

    public void setFmp(BigDecimal fmp) {
        this.fmp = fmp;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
