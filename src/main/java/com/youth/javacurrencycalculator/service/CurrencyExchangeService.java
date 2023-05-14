package com.youth.javacurrencycalculator.service;

import com.youth.javacurrencycalculator.domain.Currency;
import com.youth.javacurrencycalculator.dto.CurrencyExchangeResponse;
import com.youth.javacurrencycalculator.dto.CurrencyResponse;
import com.youth.javacurrencycalculator.infrastructure.CurrencyExchange;
import com.youth.javacurrencycalculator.repository.CurrencyExchangeClient;
import com.youth.javacurrencycalculator.repository.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CurrencyExchangeService {

    private final CurrencyExchangeClient currencyExchangeClient;

    private final CurrencyRepository currencyRepository;

    public List<CurrencyResponse> list() {
        List<Currency> currencies = currencyRepository.findAll();

        return currencies.stream()
                .map(currency -> new CurrencyResponse(currency.getCode(), currency.getName(), currency.getExchange()))
                .collect(Collectors.toList());
    }

    @Transactional
    public void insert() {
        currencyRepository.saveAll(currencyExchangeClient.call());
    }

    @Transactional
    public void update() {
        List<Currency> currencies = currencyExchangeClient.call();

        currencyRepository.findAll().stream()
                .filter(currency -> currencies.stream().anyMatch(c -> c.getCode().equals(currency.getCode())))
                .forEach(currency -> currency.changeExchange(currencies.stream()
                        .filter(c -> c.getCode().equals(currency.getCode()))
                        .mapToDouble(Currency::getExchange).findFirst().orElse(currency.getExchange())));
    }
}
