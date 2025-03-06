import org.joda.money.Money;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    // Agregar productos al carrito
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calcular el total antes del descuento
    public Money calculateTotal() {
        Money total = Money.zero(products.get(0).getPrice().getCurrencyUnit());  // Asume que todos los productos tienen la misma moneda
        for (Product product : products) {
            total = total.plus(product.getPrice());
        }
        return total;
    }

    // Calcular el total con descuentos aplicados
    public Money calculateTotalWithDiscounts() {
        Money total = Money.zero(products.get(0).getPrice().getCurrencyUnit());  // Asume que todos los productos tienen la misma moneda
        for (Product product : products) {
            // Si el producto tiene descuento, aplicar el descuento
            if (product.getName().equals("Laptop")) {
                total = total.plus(product.applyDiscount(10));  // Descuento del 10% para la Laptop
            } else if (product.getName().equals("Smartphone")) {
                total = total.plus(product.applyDiscount(20));  // Descuento del 20% para el Smartphone
            } else {
                total = total.plus(product.getPrice());  // Sin descuento para otros productos
            }
        }
        return total;
    }
}

