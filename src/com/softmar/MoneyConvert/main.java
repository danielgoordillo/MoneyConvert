package com.softmar.MoneyConvert;

import org.joda.money.Money;
import org.joda.money.CurrencyUnit;

public class main {
    public static void main(String[] args) {
        System.out.println("Programa de conversión de divisas");
        System.out.println("--------------------------------");

        // Definir cantidades en diferentes monedas
        Money usdAmount = Money.of(CurrencyUnit.USD, 100);
        System.out.println("Cantidad original: " + usdAmount);

        // Definimos la moneda euro
        CurrencyUnit eur = CurrencyUnit.EUR;

        // Tipo de cambio ficticio (1 USD = 0.85 EUR)
        double exchangeRate = 0.85;
        System.out.println("Tipo de cambio: 1 USD = " + exchangeRate + " EUR");

        // Realizar conversion
        Money eurAmount = CurrencyConverter.convert(usdAmount, eur, exchangeRate);

        // Mostrar resultado
        System.out.println("Resultado: " + usdAmount + " equivale a " + eurAmount);

        // Pruebo otra cantidad para ver
        Money usdAmount2 = Money.of(CurrencyUnit.USD, 200);
        Money eurAmount2 = CurrencyConverter.convert(usdAmount2, eur, exchangeRate);
        System.out.println(usdAmount2 + " equivale a " + eurAmount2);
    }
}

