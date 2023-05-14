package com.youth.javacurrencycalculator.domain;


import lombok.Getter;

@Getter
public class Currency {

    private String code;

    private String name;

    private double exchange;

    public Currency(String code, String name, double exchange) {
        this.code = code;
        this.name = name;
        this.exchange = exchange;
    }
}
