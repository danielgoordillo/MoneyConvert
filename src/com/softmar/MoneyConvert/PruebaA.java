package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class PruebaA {
    public static void main(String[] args) {
        // Definir cantidades de dinero en USD
        Money usd1 = Money.of(CurrencyUnit.USD, 100.00);
        Money usd2 = Money.of(CurrencyUnit.USD, 50.00);

        // Tipo de cambio ficticio (1 USD = 0.85 EUR)
        long exchangeRate = (long) 0.85;

        // Conversión de USD a EUR usando CurrencyConverter
        Money eurAmount = CurrencyConverter.convert(usd1, exchangeRate);
        System.out.println("Conversión: USD 100 equivale a EUR " + eurAmount.getAmount());

        // Suma de usd1 y usd2
        Money sum = CurrencyConverter.addMoney(usd1, usd2);
        System.out.println("Suma: " + sum.getAmount() + " USD");

        // Resta de usd1 y usd2
        Money difference = CurrencyConverter.subtractMoney(usd1, usd2);
        System.out.println("Resta: " + difference.getAmount() + " USD");

        // Comparación de usd1 y usd2
        String comparison = CurrencyConverter.compareAmounts(usd1, usd2);
        System.out.println("Comparación: " + comparison);
    }
}


