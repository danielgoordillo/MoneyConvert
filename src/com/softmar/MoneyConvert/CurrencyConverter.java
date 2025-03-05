package com.softmar.MoneyConvert;


import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

    public class CurrencyConverter {
        public static Money convert(Money amount, CurrencyUnit targetCurrency, double rate) {
            double convertedAmount = amount.getAmount().doubleValue() * rate;
            return Money.of(targetCurrency, convertedAmount);
        }
    }

