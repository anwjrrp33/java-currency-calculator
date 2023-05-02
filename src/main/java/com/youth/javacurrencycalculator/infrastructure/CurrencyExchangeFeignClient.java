package com.youth.javacurrencycalculator.infrastructure;

import com.youth.javacurrencycalculator.dto.CurrencyExchangeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ExchangeRateOpenFeign")
public interface CurrencyExchangeFeignClient {

    @GetMapping("/live")
    CurrencyExchangeResponse call(@RequestParam(name = "access_key") String accessKey);
}
