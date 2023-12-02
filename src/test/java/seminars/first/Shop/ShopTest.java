package seminars.first.Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop;
    Product prod1;
    Product prod2;
    Product prod3;

    @BeforeEach
    void setUp(){
        shop = new Shop();
        prod1 = Product.builder()
                .cost(22)
                .title("prod1")
                .build();
        prod2 = Product.builder()
                .cost(34)
                .title("prod2")
                .build();
        prod3 = Product.builder()
                .cost(45).title("prod3").build();
    }
    @Test
    void shopObjectIsNotNull(){
        assertNotNull(shop);
    }
    @Test
    @DisplayName("Check ordering method by price")
        //by default ordering is by ascending
    void sortProductsByPriceTest() {
        //setting unordered by price
        shop.setProducts(new ArrayList<>(Arrays.asList(prod1 , prod3, prod2)));
        //sort with class method
        shop.sortProductsByPrice();

        //second value less than first - true / test not passed
        assertFalse( shop.getProducts().get(1).getCost() < shop.getProducts().get(0).getCost());
    }

    @Test
    @DisplayName("Check getting the higher price product in the shop")
    void getMostExpensiveProduct() {
        //setting unordered by price
        shop.setProducts(new ArrayList<>(Arrays.asList(prod1 , prod3, prod2)));
        //get max
        Product maxByPrice = shop.getMostExpensiveProduct();
        assertEquals( shop.getProducts().get(1),maxByPrice, "Must be product#3 ");
    }
}