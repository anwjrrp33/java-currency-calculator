package com.youth.javacurrencycalculator.service;

import com.youth.javacurrencycalculator.domain.Currency;
import com.youth.javacurrencycalculator.dto.CurrencyExchangeResponse;
import com.youth.javacurrencycalculator.dto.CurrencyResponse;
import com.youth.javacurrencycalculator.infrastructure.CurrencyExchange;
import com.youth.javacurrencycalculator.repository.CurrencyExchangeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CurrencyExchangeService {

    private final CurrencyExchangeClient currencyExchangeClient;

    public List<CurrencyResponse> call() {
        List<Currency> currencies = currencyExchangeClient.call();

        return currencies.stream()
                .map(currency -> new CurrencyResponse(currency.getCode(), currency.getName(), currency.getExchange()))
                .collect(Collectors.toList());
    }
}
