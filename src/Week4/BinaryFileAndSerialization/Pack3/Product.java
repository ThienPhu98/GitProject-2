package Week4.BinaryFileAndSerialization.Pack3;

import java.io.Serializable;

public class Product implements Serializable{
    private int code;
    private String name;
    private String manufacturer;
    private double price;

    public Product() {
    }

    public Product(int code, String name, String manufacturer, double price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' + ", price=" + price + "$}";
    }
}
