package com.youth.javacurrencycalculator.infrastructure;

import com.youth.javacurrencycalculator.dto.CurrencyExchangeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ExchangeRateOpenFeign")
public interface CurrencyExchangeFeignClient {

    @GetMapping("/currency_data/live")
    CurrencyExchangeResponse call(@RequestHeader(name = "apikey") String apikey,
                                  @RequestParam(name = "source") String source,
                                  @RequestParam(name = "currencies") String currencies);
}
