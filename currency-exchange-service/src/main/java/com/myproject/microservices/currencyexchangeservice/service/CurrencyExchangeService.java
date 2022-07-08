package com.myproject.microservices.currencyexchangeservice.service;

import com.myproject.microservices.currencyexchangeservice.entity.CurrencyExchange;
import com.myproject.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository repository;

    public List<CurrencyExchange> findAll() {
        return repository.findAll();
    }

    public CurrencyExchange findByFromAndTo(String from, String to) {
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
        if (currencyExchange == null) {
            throw new NoSuchElementException(String.format(
                    "There is no currency exchange with FROM = '%s', TO = '%s'",
                    from, to));
        }
        return currencyExchange;
    }
}
