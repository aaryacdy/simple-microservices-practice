package com.arya.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;

    private String currencyFrom;

    private String currencyTo;

    private BigDecimal quantity;

    private BigDecimal conversionMultiple;

    private BigDecimal totalQuantityAmount;

    private int appPort;

    public CurrencyConversion(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotalQuantityAmount() {
        return totalQuantityAmount;
    }

    public void setTotalQuantityAmount(BigDecimal totalQuantityAmount) {
        this.totalQuantityAmount = totalQuantityAmount;
    }

    public int getAppPort() {
        return appPort;
    }

    public void setAppPort(int appPort) {
        this.appPort = appPort;
    }

    public CurrencyConversion(Long id, String currencyFrom, String currencyTo,
                              BigDecimal quantity,
                              BigDecimal conversionMultiple, BigDecimal totalQuantityAmount,
                              int port) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalQuantityAmount = totalQuantityAmount;
        this.appPort =port;
    }
}
