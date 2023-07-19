package com.arya.microservices.currencyexchangeservice;

import com.arya.microservices.currencyexchangeservice.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);
}
