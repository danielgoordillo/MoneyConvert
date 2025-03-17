package com.softmar.MoneyConvert;

import org.joda.money.Money;
import org.joda.money.CurrencyUnit;

public class PruebaA {
    public static void main(String[] args) {
        System.out.println(" PRUEBA DE CONVERSIONES Y OPERACIONES ");

        // Defino variables de prueba
        Money usd1 = Money.of(CurrencyUnit.USD, 100);
        Money usd2 = Money.of(CurrencyUnit.USD, 50);


        CurrencyUnit eur = CurrencyUnit.EUR;

        // Tipo de cambio USD a EUR (ficticio)
        double exchangeRate = 0.85;

        // Hago la conversión
        Money eurAmount = CurrencyConverter.convert(usd1, eur, exchangeRate);

        // Muestro los resultados
        System.out.println("Conversión: " + usd1 + " equivale a " + eurAmount);


        System.out.println("\nOperaciones con cantidades:");

        // Suma
        Money resultadoSuma = CurrencyConverter.addMoney(usd1, usd2);
        System.out.println("Suma: " + resultadoSuma);

        // Resta
        Money resultadoResta = CurrencyConverter.subtractMoney(usd1, usd2);
        System.out.println("Resta: " + resultadoResta);

        // Comparacion
        String comparacion = CurrencyConverter.compareAmounts(usd1, usd2);
        System.out.println("Comparación: " + comparacion);

        // Otra comparacion
        String otraComparacion = CurrencyConverter.compareAmounts(usd2, usd1);
        System.out.println("Otra comparación: " + otraComparacion);
    }
}


