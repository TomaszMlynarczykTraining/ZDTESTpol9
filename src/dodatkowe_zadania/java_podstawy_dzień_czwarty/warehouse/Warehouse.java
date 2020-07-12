package dodatkowe_zadania.java_podstawy_dzień_czwarty.warehouse;

import dodatkowe_zadania.java_podstawy_dzień_czwarty.animals.Dog;

import java.util.Scanner;

public class Warehouse {

    private final static int MAX_PRODUCTS = 3;
    private static Product[] products = new Product[MAX_PRODUCTS];
    private Dog dog;


    public static void addNewProduct(Product product) {
        int highestId = getHighestId();

        if (products[0] == null) {
            products[highestId] = product;
        } else {
            products[highestId + 1] = product;
        }

    }

    public static boolean isWarehouseFull() {
        int highestId = getHighestId();

        return highestId >= MAX_PRODUCTS - 1;

    }

    public static void removeProduct(Product product) {
        products[product.getId()] = null;
    }

    public static void showSupplies() {
        System.out.println("Nasz asortyment to: ");
        for (Product product : products) {
            if (product != null)
                System.out.println(product);
        }
    }

    public static void showSumOfProducts() {
        int result = 0;
        for (Product product : products) {
            if (product != null)
                result += product.getAmount();
        }
        System.out.println("Suma produktów w naszym magazynie : " + result);
    }

    public static Product getProductFromCommandLine(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Podaj typ");
        String type = scanner.nextLine();
        System.out.println("Podaj nazwę");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę");
        int price = scanner.nextInt();
        System.out.println("Podaj ilość");
        int amount = scanner.nextInt();

        return new Product(type, name, price, amount);
    }

    public static Product findProductById(Scanner scanner) {
        System.out.println("Podaj id produktu który chcesz usunąć");
        int id = scanner.nextInt();

        return products[id];
    }


    private static int getHighestId() {
        int highestId = 0;
        if (products.length > 0) {
            for (Product product : products) {
                if (product != null) {
                    if (product.getId() > highestId)
                        highestId = product.getId();
                }
            }
        }
        return highestId;
    }

    public static void updateProductAmount(Scanner scanner) {

        System.out.println("Podaj id produktu który chcesz zaktualizować");
        int id = scanner.nextInt();


        System.out.println("Podaj nową ilość");
        int amount = scanner.nextInt();

        products[id].setAmount(amount);
    }

    @Override
    public String toString() {

        return dog.getMuzzle().toString() + dog.getAge();
    }
}
