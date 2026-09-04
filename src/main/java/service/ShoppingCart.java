package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        float total = 0;

        for (Food product : products) {
            float amount = product.getAmount();
            float price = product.getPrice();

            total += amount * price;
        }

        return total;
    }

    public float getTotalPriceWithDiscount() {
        float total = 0;

        for (Food product : products) {
            float amount = product.getAmount();
            float price = product.getPrice();
            float productPrice = amount * price;
            float discount = product.getDiscount();

            float discountAmount = (productPrice * discount) / 100;
            float discountPrice = productPrice - discountAmount;

            total += discountPrice;
        }

        return total;
    }

    public float getTotalVegetarianPrice() {
        float total = 0;

        for (Food product : products) {
            float amount = product.getAmount();
            float price = product.getPrice();
            float productPrice = amount * price;

            if (product.isVegetarian()) {
                total += productPrice;
            }
        }

        return total;
    }
}