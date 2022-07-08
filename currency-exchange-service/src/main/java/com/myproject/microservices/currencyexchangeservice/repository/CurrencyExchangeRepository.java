package com.myproject.microservices.currencyexchangeservice.repository;

import com.myproject.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository
        extends JpaRepository<CurrencyExchange, Integer> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
