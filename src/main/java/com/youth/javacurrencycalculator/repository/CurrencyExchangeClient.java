package com.youth.javacurrencycalculator.repository;

import com.youth.javacurrencycalculator.domain.Currency;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyExchangeClient {

    List<Currency> call();
}
