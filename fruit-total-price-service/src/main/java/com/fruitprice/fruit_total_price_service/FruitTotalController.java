package com.fruitprice.fruit_total_price_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class FruitTotalController {

    @Autowired
    private Environment environment;

    @GetMapping("/fruit-total/fruit/{fruit}/month/{month}/quantity/{quantity}")
    public FruitTotalEntity calculateTotalFruitPrice(
            @PathVariable String fruit,
            @PathVariable String month,
            @PathVariable BigDecimal quantity
    ) {

        HashMap<String, String> uriVairiables = new HashMap<>();
        uriVairiables.put("fruit", fruit);
        uriVairiables.put("month", month);

        ResponseEntity<FruitTotalEntity> responseEntity =
                new RestTemplate().getForEntity(
                        "http://localhost:8000/fruit-price/fruit/{fruit}/month/{month}",
                        FruitTotalEntity.class, uriVairiables
                );

        FruitTotalEntity fruitTotal = responseEntity.getBody();

        return new FruitTotalEntity(fruitTotal.getId(),
                fruit, month, quantity,
                fruitTotal.getFmp(),
                quantity.multiply(fruitTotal.getFmp()),
                environment.getProperty("server.port"));
    }
}