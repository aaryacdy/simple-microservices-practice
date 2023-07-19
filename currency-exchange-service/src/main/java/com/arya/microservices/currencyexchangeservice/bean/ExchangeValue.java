package com.arya.microservices.currencyexchangeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="tbl_exchange_value")
public class ExchangeValue {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String currencyFrom;

    @Column(name = "currency_to")
    private String currencyTo;

    @Column(name="conversion_multiple")
    private BigDecimal conversionMultiple;

    @Column(name="app_port")
    private int appPort;

    public ExchangeValue() {

    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.currencyFrom = from;
        this.currencyTo = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return currencyFrom;
    }

    public void setFrom(String from) {
        this.currencyFrom = from;
    }

    public String getTo() {
        return currencyTo;
    }

    public void setTo(String to) {
        this.currencyTo = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public void setAppPort(int port) {
        this.appPort = port;
    }

    public int getPort() {
        return appPort;
    }

}
