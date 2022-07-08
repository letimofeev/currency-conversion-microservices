package com.myproject.microservices.currencyconversionservice.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

    private int id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiplier;
    private BigDecimal amount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(int id, String from, String to, BigDecimal quantity,
                              BigDecimal conversionMultiplier, BigDecimal amount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiplier = conversionMultiplier;
        this.amount = amount;
        this.environment = environment;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiplier() {
        return conversionMultiplier;
    }

    public void setConversionMultiplier(BigDecimal conversionMultiplier) {
        this.conversionMultiplier = conversionMultiplier;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
