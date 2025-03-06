import org.joda.money.Money;
import org.joda.money.CurrencyUnit;

public class PruebaA {

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

    public static void main(String[] args) {
        // Definir las cantidades de USD
        Money usd1 = Money.of(CurrencyUnit.USD, 100.00);
        Money usd2 = Money.of(CurrencyUnit.USD, 50.00);

        // Definir tipo de cambio ficticio (1 USD = 0.85 EUR)
        CurrencyUnit eur = CurrencyUnit.of("EUR");
        double exchangeRate = 0.85;

        // Conversión de USD a EUR
        Money eurAmount = usd1.multipliedBy((long) exchangeRate);
        System.out.println("Conversión: USD 100 equivale a EUR " + eurAmount.getAmount());

        // Suma de usd1 y usd2
        Money sum = addMoney(usd1, usd2);
        System.out.println("Suma: " + sum.getAmount() + " USD");

        // Resta de usd1 y usd2
        Money difference = subtractMoney(usd1, usd2);
        System.out.println("Resta: " + difference.getAmount() + " USD");

        // Comparación de usd1 y usd2
        String comparison = compareAmounts(usd1, usd2);
        System.out.println("Comparación: " + comparison);
    }
}

