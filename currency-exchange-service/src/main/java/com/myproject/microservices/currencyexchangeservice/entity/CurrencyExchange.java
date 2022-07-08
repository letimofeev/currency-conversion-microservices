package com.myproject.microservices.currencyexchangeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    private int id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private BigDecimal conversionMultiplier;

    private String environment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(int id, String from, String to, BigDecimal conversionMultiplier) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiplier = conversionMultiplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiplier() {
        return conversionMultiplier;
    }

    public void setConversionMultiplier(BigDecimal conversionMultiplier) {
        this.conversionMultiplier = conversionMultiplier;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
