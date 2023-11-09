package com.in28minutes.springboot.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.springboot.learnspringboot.CurrencyServiceConfiguration;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency-service")
    public CurrencyServiceConfiguration demo(){
        return currencyServiceConfiguration;
    }
}
