import org.joda.money.Money;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    // Aplicar descuento al precio
    public Money applyDiscount(double percentage) {
        // Calculamos el nuevo precio con el descuento
        double discountAmount = price.getAmount().doubleValue() * (percentage / 100);
        return price.minus(Money.of(price.getCurrencyUnit(), discountAmount));
    }
}

