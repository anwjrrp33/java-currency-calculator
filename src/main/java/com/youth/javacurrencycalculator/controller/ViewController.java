package com.youth.javacurrencycalculator.controller;

import com.youth.javacurrencycalculator.service.CurrencyExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ViewController {

    private final CurrencyExchangeService currencyExchangeService;

    @GetMapping("/currency-calculator")
    public String currencyCalculator(Model model) {
        model.addAttribute("currencies", currencyExchangeService.list());
        return "currency-calculator";
    }
}
