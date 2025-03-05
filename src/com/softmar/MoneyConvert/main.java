
    package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

    public class main {
        public static void main(String[] args) {
            // Definir cantidades en diferentes monedas
            Money usdAmount = Money.of(CurrencyUnit.USD, 100);
            CurrencyUnit eur = CurrencyUnit.EUR;

            // Tipo de cambio ficticio (1 USD = 0.85 EUR)
            double exchangeRate = 0.85;

            // Realizar conversión
            Money eurAmount = CurrencyConverter.convert(usdAmount, eur, exchangeRate);

            // Mostrar resultado
            System.out.println(usdAmount + " equivale a " + eurAmount);
        }
    }


