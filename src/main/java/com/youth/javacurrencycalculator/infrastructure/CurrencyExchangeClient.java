package com.youth.javacurrencycalculator.infrastructure;

import com.youth.javacurrencycalculator.dto.CurrencyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ExchangeRateOpenFeign")
public interface CurrencyExchangeClient {

    @GetMapping("/live")
    CurrencyResponse call(@RequestParam(name = "access_key") String key);
}
