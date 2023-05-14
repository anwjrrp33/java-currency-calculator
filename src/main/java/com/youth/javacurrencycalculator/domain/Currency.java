package com.youth.javacurrencycalculator.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private double exchange;

    public Currency(String code, String name, double exchange) {
        this.code = code;
        this.name = name;
        this.exchange = exchange;
    }

    public void changeExchange(double exchange) {
        this.exchange = exchange;
    }
}
