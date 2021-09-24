package Week3.Framework.Pack4;

import java.util.Objects;

public class Product {
    private String manufacturer;
    private String name;
    private Double price;
    private Integer id;

    public Product() {
    }

    public Product(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + getName() + ", product='" + getManufacturer() + ", " + "price=" + getPrice() + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(price, product1.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, name, price, id);
    }
}
