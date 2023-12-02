package seminars.first.Shop;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public int compareTo(Product o) {
        return this.cost - o.cost;
    }

}