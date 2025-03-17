package com.softmar.MoneyConvert;

import org.joda.money.Money;
import org.joda.money.CurrencyUnit;

public class PruebaShoppingCart {
    public static void main(String[] args) {
        // Crear productos
        Product laptop = new Product("Laptop", Money.of(CurrencyUnit.USD, 1200.00));
        Product smartphone = new Product("Smartphone", Money.of(CurrencyUnit.USD, 800.00));
        Product headphones = new Product("Auriculares", Money.of(CurrencyUnit.USD, 150.00));

        // Crear carrito de compras
        ShoppingCart cart = new ShoppingCart();

        // Agregar productos al carrito
        cart.addProduct(laptop);
        cart.addProduct(smartphone);
        cart.addProduct(headphones);

        // Mostrar los precios originales y con descuentos
        System.out.println("Producto: " + laptop.getName() +
                " - Precio Original: " + laptop.getPrice() +
                " - Precio con descuento (10%): " + laptop.applyDiscount(10));

        System.out.println("Producto: " + smartphone.getName() +
                " - Precio Original: " + smartphone.getPrice() +
                " - Precio con descuento (20%): " + smartphone.applyDiscount(20));

        System.out.println("Producto: " + headphones.getName() +
                " - Precio Original: " + headphones.getPrice() +
                " - Sin descuento aplicado.");

        // Mostrar total sin descuentos
        Money totalWithoutDiscounts = cart.calculateTotal();
        System.out.println("\nTotal sin descuento: " + totalWithoutDiscounts);

        // Mostrar total con descuentos aplicados
        Money totalWithDiscounts = cart.calculateTotalWithDiscounts();
        System.out.println("Total con descuentos aplicados: " + totalWithDiscounts);
    }
}

