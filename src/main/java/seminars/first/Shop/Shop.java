package seminars.first.Shop;

import lombok.Getter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов

    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        //HomeWork 01 Task02

        if (this.products.isEmpty()) {
            throw new IllegalArgumentException("Products are empty. Nothing to sort.");
        } else {
            //In product added compareTo
            Collections.sort(this.products);
        }

        return this.products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно

        return this.products.stream()
                .max(Comparator.comparing(Product::getCost))
                .orElseThrow(NoSuchElementException::new);
    }

}