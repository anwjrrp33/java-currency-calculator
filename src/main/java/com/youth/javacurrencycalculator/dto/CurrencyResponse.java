package com.youth.javacurrencycalculator.dto;

import lombok.Getter;

@Getter
public class CurrencyResponse {

    private String code;

    private String name;

    private double exchange;

    public CurrencyResponse(String code, String name, double exchange) {
        this.code = code;
        this.name = name;
        this.exchange = exchange;
    }
}
