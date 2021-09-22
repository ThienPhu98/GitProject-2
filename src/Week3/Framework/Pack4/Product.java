package Week3.Framework.Pack4;

import java.util.ArrayList;

public class Product implements Comparable<Product> {
    private String product;
    private String name;
    private Integer price;

    public Product() {
    }

    public Product(String name, String product, int price) {
        this.name = name;
        this.product = product;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + getName() +", product='" + getProduct() +", price=" + getPrice() + "$}";
    }

    public int compareTo(Product product) {
        return this.getName().compareTo(product.getName());
    }
}
