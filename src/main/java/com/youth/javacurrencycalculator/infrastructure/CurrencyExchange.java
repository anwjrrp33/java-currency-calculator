package com.youth.javacurrencycalculator.infrastructure;

import com.youth.javacurrencycalculator.domain.Currency;
import com.youth.javacurrencycalculator.dto.CurrencyExchangeResponse;
import com.youth.javacurrencycalculator.repository.CurrencyExchangeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CurrencyExchange implements CurrencyExchangeClient {

    @Value("${client.apikey}")
    private String apikey;

    private final CurrencyExchangeFeignClient currencyExchangeFeignClient;

    public List<Currency> call() {
        CurrencyExchangeResponse currencyExchangeResponse = currencyExchangeFeignClient.call(apikey, "USD", "KRW,JPY,PHP");

        return List.of(
                new Currency("KRW", "한국", currencyExchangeResponse.getQuotes().getKrw()),
                new Currency("JPY", "일본", currencyExchangeResponse.getQuotes().getJpy()),
                new Currency("PHP", "필리핀", currencyExchangeResponse.getQuotes().getPhp()));
    }
}
