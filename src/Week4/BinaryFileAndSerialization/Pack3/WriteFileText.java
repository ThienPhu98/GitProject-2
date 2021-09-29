package Week4.BinaryFileAndSerialization.Pack3;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFileText {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String Path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone13", "Apple", 999));
        products.add(new Product(2, "SSNote9", "SamSung", 929));
        products.add(new Product(3, "OPPO", "OPPO", 673));
        products.add(new Product(4, "Star5", "VinSmart", 720));
        writeToFile("src\\Week4\\BinaryFileAndSerialization\\Pack3\\products.txt", products);
        List<Product> productsDataFromFile = readDataFromFile("src\\Week4\\BinaryFileAndSerialization\\Pack3\\products.txt");
        for (Product product : productsDataFromFile) {
            System.out.println(product);
        }
    }
}
