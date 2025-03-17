package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class CurrencyConverter {

    // Método para convertir dinero a otra moneda
    public static Money convert(Money amount, long rate) {
        return amount.multipliedBy(rate);
    }

    // Método para sumar dos cantidades de dinero
    public static Money addMoney(Money m1, Money m2) {
        return m1.plus(m2);
    }

    // Método para restar dos cantidades de dinero
    public static Money subtractMoney(Money m1, Money m2) {
        return m1.minus(m2);
    }

    // Método para comparar dos cantidades de dinero
    public static String compareAmounts(Money m1, Money m2) {
        if (m1.isGreaterThan(m2)) {
            return m1.getAmount() + " es mayor que " + m2.getAmount();
        } else if (m1.isLessThan(m2)) {
            return m1.getAmount() + " es menor que " + m2.getAmount();
        } else {
            return m1.getAmount() + " es igual a " + m2.getAmount();
        }
    }
}


