package com.youth.javacurrencycalculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class CurrencyExchangeSchedular {

    private final CurrencyExchangeService currencyExchangeService;

    @Scheduled(cron = "0 0 7 * * ?")
    @Transactional
    public void insertCurrencyTask() { // 오전 7시에 실행되는 스케줄링 메서드
        currencyExchangeService.update();
    }
}
