package com.youth.javacurrencycalculator.repository;

import com.youth.javacurrencycalculator.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
