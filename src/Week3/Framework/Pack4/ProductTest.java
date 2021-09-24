package Week3.Framework.Pack4;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager List = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("ProductList before add product:");
        System.out.print(showProduct(List));

        Product product1 = new Product("Iphone", "Apple", 6.7);
        Product product2 = new Product("Samsung", "Samsung", 4);
        Product product3 = new Product("Oppo", "Oppo", 2.3);
        Product product4 = new Product("LG", "LG", 3.4);
        Product product5 = new Product("Nokia", "Nokia", 1.5);
        List.add(product1);
        List.add(product2);
        List.add(product3);
        List.add(product4);
        List.add(product5);

        System.out.print("\n==============================================================");
        System.out.print("\nProductList after add products:");
        System.out.print(showProduct(List));

        List.remove(2);
        System.out.print("\n==============================================================");
        System.out.print("\nProductList remove product at position 2:");
        System.out.print(showProduct(List));


        System.out.print("\n==============================================================");
        System.out.print("\nChange products System:");
        int index = 0;
        boolean checkIndex = false;
        while (!checkIndex){
            System.out.print("\nEnter index of product: ");
            String inputIndex = scanner.nextLine();
            if (isNumeric(inputIndex)) {
                try {
                    index = Integer.parseInt(inputIndex);
                    if (index > -1 && index < List.size()) {
                        checkIndex = true;
                    } else {
                        System.out.print("\nYour Input is Illegal!!! index must be more than '-1' and less than size of List (" + List.size() + ").");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("\nYour Input is Illegal!!! index must be a Integer");
                }
            } else {
                System.out.print("\nYour input is not a number, please try again!");
            }
        }

        String name = "";
        boolean checkName = false;
        while (!checkName) {
            System.out.print("\nEnter new name of product: ");
            name = scanner.nextLine();
            if (name == "") {
                System.out.print("\nName for product can not be null!");
            } else {
                checkName = true;
            }
        }

        String manufacturer = "";
        boolean checkManufacturer = false;
        while (!checkManufacturer) {
            System.out.print("\nEnter new Manufacturer of product: ");
            manufacturer = scanner.nextLine();
            if (manufacturer == "") {
                System.out.print("\nManufacturer for product can not be null!");
            } else {
                checkManufacturer = true;
            }
        }


        double price = 0;
        boolean checkPrice = false;
        while (!checkPrice){
            System.out.print("\nEnter new price of product: ");
            String inputPrice = scanner.nextLine();
            if (isNumeric(inputPrice)) {
                try {
                    price = Double.parseDouble(inputPrice);
                    if (index > -1 && index < List.size()) {
                        checkPrice = true;
                    } else {
                        System.out.print("\nYour Input is Illegal!!! price must be more than '-1' and less than size of List (" + List.size() + ").");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("\nYour Input is Illegal!!! price must be a double");
                }
            } else {
                System.out.print("\nYour input is not a number, please try again!");
            }
        }


        Product product = new Product(name, manufacturer, price);
        List.change(index, product);
        System.out.print("\nProductList after change:");
        System.out.print(showProduct(List));

        System.out.print("\n==============================================================");
        System.out.print("\nFind product by name:");
        System.out.print("\nEnter name of product you want to find: ");
        String inputName = scanner.nextLine();
        if (List.indexOf(inputName) == -1) {
            System.out.print("\nThere is not have product: " + inputName + " in Array");
        } else {
            System.out.print("Find product '" + inputName + "' at position: " + List.indexOf(inputName) + "' in Array");
        }

        List.sort();
        System.out.print("\n==============================================================");
        System.out.print("\nProductList after sort by price (from cheap to expensive):");
        System.out.print(showProduct(List));

    }

    public static String showProduct(ProductManager List){
        String OutPrint = "";
        if (List.size() == 0 ) {
            OutPrint = "\nNull";
        } else {
            for (int i = 0; i < List.size(); i++) {
                OutPrint += "\n" + List.get(i).toString() + ", index: '" + i + "'}";
            }
        }
        return OutPrint;
    }

    public static boolean isNumeric(String inputString) {
        return inputString.matches("-?\\d+(\\.\\d+)?");
    }
}
