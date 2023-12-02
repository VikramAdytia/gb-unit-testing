package seminars.third;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private Store store;

    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    void setUp() {
        product1 = new Product("testApple", 999 , 9);
        product2 = new Product("testBanana", 777 , 7);
        product3 = new Product("testMelon", 555 , 5);
        store = new Store();
    }

    @AfterEach
    void tearDown() {
        product1 =null;
        product2 =null;
        product3 =null;
        store = null;
        
    }

    @Test
    void addProductToInventory() {
        assertNotNull(product1);
    }

    @Test
    void removeProductFromInventory() {
    }

    @Test
    void findProductByName() {
    }

    @Test
    void createCart() {
    }
}