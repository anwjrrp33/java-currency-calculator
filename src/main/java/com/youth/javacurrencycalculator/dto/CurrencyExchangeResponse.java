package com.youth.javacurrencycalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {
 *     "success":true,
 *     "terms":"https://currencylayer.com/terms",
 *     "privacy":"https://currencylayer.com/privacy",
 *     "timestamp":1682755803,
 *     "source":"USD",
 *     "quotes":{
 *         "USDKRW":1338.160384,
 *         "USDJPY":136.30904,
 *         "USDPHP":55.388039,
 *     }
 * }
 */
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyExchangeResponse {
    private boolean success;
    private long timestamp;
    private String source;
    private Quotes quotes;

    @Getter
    @Setter
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Quotes {
        @JsonProperty("USDKRW")
        private double krw;
        @JsonProperty("USDJPY")
        private double jpy;
        @JsonProperty("USDPHP")
        private double php;
    }
}
