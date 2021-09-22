package Week3.Framework.Pack4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList();

        System.out.print("ProductList before add product:");
        System.out.print("\n" + showProduct(productList));

        Product product1 = new Product("Iphone", "Apple", 6);
        Product product2 = new Product("Samsung", "Samsung", 4);
        Product product3 = new Product("Oppo", "Oppo", 2);
        Product product4 = new Product("LG", "LG", 3);
        Product product5 = new Product("Nokia", "Nokia", 1);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        System.out.print("\nProductList after add product:");
        System.out.print("\n" + showProduct(productList));

        productList.remove(2);
        System.out.print("\nProductList remove product at position 2:");
        System.out.print("\n" + showProduct(productList));

//        System.out.print("\nProductList after sort by price:");


    }

    public static String showProduct(ArrayList productList){
        String OutPrint = "";
        if (productList.size() == 0 ) {
            OutPrint = "Null";
        } else {
            for (Object item : productList) {
                OutPrint += "\n" + item.toString();
            }
        }
        return OutPrint;
    }
}
