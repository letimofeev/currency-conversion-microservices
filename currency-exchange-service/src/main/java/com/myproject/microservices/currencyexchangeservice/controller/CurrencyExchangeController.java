package com.myproject.microservices.currencyexchangeservice.controller;

import com.myproject.microservices.currencyexchangeservice.entity.CurrencyExchange;
import com.myproject.microservices.currencyexchangeservice.service.CurrencyExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

    @Autowired
    private CurrencyExchangeService service;

    @Autowired
    private Environment environment;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to) {
        logger.info("retrieveExchangeValue called with {} to {}", from, to);

        CurrencyExchange currencyExchange = service.findByFromAndTo(from, to);
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
