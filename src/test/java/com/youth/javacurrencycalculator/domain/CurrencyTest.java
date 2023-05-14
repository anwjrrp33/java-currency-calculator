package com.youth.javacurrencycalculator.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class CurrencyTest {

    @DisplayName("환율 생성 테스트")
    @Test
    void createCurrencyTest() {
        assertThatCode(() -> new Currency("KRW", "한국", 1342.80))
                .doesNotThrowAnyException();
    }
}