package Week3.Framework.Pack4;

import java.util.*;

public class ProductManager {
    public ArrayList<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public void add(Product product) {
      productList.add(product);
    }

    public void change(int index, Product o) {
        productList.set(index, o);
    }

    public void remove(int index) {
        productList.remove(index);
    }

    public int indexOf(String name) {
        int position = -1;
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getName().equalsIgnoreCase(name)) {
                return position = i;
            }
        }
        return position;
    }

    public Object get(int index) {
        return productList.get(index);
    }

    public int size() {
        return productList.size();
    }

    public void sort(){
            productList.sort(new PriceSort());
    }

}
