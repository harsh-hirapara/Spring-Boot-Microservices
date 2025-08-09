package com.fruitprice.fruit_month_price_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitPriceController {

    @Autowired
    private Environment environment;

    @Autowired
    private FruitPriceRepository repository;

    @GetMapping("/fruit-price/fruit/{fruit}/month/{month}")
    public FruitPriceEntity retrieveExchangeValue(
            @PathVariable String fruit,
            @PathVariable String month
    ){
        FruitPriceEntity fruitPriceEntity = repository.findByFruitAndMonth(fruit, month);

        if(fruitPriceEntity == null){
            throw new RuntimeException(
                    "Unable to find data for " + fruit + " and " + month
            );
        }
        String port = environment.getProperty("server.port");
        fruitPriceEntity.setEnvironment(port);

        return fruitPriceEntity;
    }
}