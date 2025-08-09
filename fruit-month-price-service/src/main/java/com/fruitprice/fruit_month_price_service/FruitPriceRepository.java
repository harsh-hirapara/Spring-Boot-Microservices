package com.fruitprice.fruit_month_price_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitPriceRepository  extends JpaRepository<FruitPriceEntity, Long> {
    FruitPriceEntity findByFruitAndMonth(String fruit, String month);
}