package com.youth.javacurrencycalculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final CurrencyExchangeService currencyExchangeService;

    @Override
    public void run(String... args) throws Exception {
        currencyExchangeService.insert();
    }
}
