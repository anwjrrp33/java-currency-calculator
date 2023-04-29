package com.youth.javacurrencycalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/currency-calculator")
    public String currencyCalculator(Model model) {
        model.addAttribute("currencies", List.of(
                new Currency("KRW", "한국","1100.14"),
                new Currency("JPY",  "일본", "987.57"),
                new Currency("PHP",  "필리핀", "104.83")
        ));
        model.addAttribute("data", "hello!!");
        return "currency-calculator";
    }

    private record Currency(String code, String name, String exchange) {}
}
