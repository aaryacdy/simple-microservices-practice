package com.arya.microservices.currencyexchangeservice;

import com.arya.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/currency-exchange")
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @Autowired
    ExchangeValueRepository repository;

    @GetMapping(value = "/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    ) {
//        ExchangeValue exchangeValue = new ExchangeValue(1000l, from, to, BigDecimal.valueOf(50));

        ExchangeValue exchangeValue = repository.findByCurrencyFromAndCurrencyTo(from, to);
        exchangeValue.setAppPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }

}
