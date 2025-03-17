package com.softmar.MoneyConvert;

import org.joda.money.Money;
import org.joda.money.CurrencyUnit;

public class CurrencyConverter {
    public static Money convert(Money amount, CurrencyUnit targetCurrency, double rate) {
        double convertedAmount = amount.getAmount().doubleValue() * rate;
        return Money.of(targetCurrency, convertedAmount);
    }

    public static Money addMoney(Money m1, Money m2) {
        // Compruebo q son las monedas iguales
        if (!m1.getCurrencyUnit().equals(m2.getCurrencyUnit())) {
            System.out.println("Error: Las monedas no coinciden");
            return m1; // Devuelvo m1 en caso de error
        }
        return m1.plus(m2);
    }

    // Metodo para restar cantidades
    public static Money subtractMoney(Money m1, Money m2) {
        if (!m1.getCurrencyUnit().equals(m2.getCurrencyUnit())) {
            System.out.println("Error: Las monedas deben ser iguales");
            return m1; // Devuelvo m1 en caso de error
        }

        return m1.minus(m2);
    }

    // Metodo  comparar cantidades
    public static String compareAmounts(Money m1, Money m2) {
        String result = "";

        // Comparamos las cantidades
        if (m1.isGreaterThan(m2)) {
            result = m1.toString() + " es mayor que " + m2.toString();
        } else if (m1.isLessThan(m2)) {
            result = m1.toString() + " es menor que " + m2.toString();
        } else {
            result = m1.toString() + " es igual a " + m2.toString();
        }

        return result;
    }
}

