package dodatkowe_zadania.java_podstawy_dzień_czwarty.warehouse;

import java.util.Scanner;

public class ToolStorage {


    public static void main(String[] args) {
        System.out.println("Podaj imię");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        int choice = 0;

        while (choice != 6) {
            choice = buyItem(scanner, userName);
        }
    }

    private static int buyItem(Scanner scanner, String userName) {

        System.out.println("Co chciałbyś zrobić (1-5)");
        System.out.println("1. Dodaj nowy produkt");
        System.out.println("2. Usuń produkt");
        System.out.println("3. Wyświetl stan magazynu");
        System.out.println("4. Wyświetl zsumowaną ilość wszystkich produktów");
        System.out.println("5. Zaktualizuj ilosc danego produktu");
        System.out.println("6. Wyjdź");


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                if (!Warehouse.isWarehouseFull()) {
                    Product productFromCommandLine = Warehouse.getProductFromCommandLine(scanner);
                    Warehouse.addNewProduct(productFromCommandLine);
                } else {
                    System.out.println("Warehouse is full");
                }
                break;
            case 2:
                Product productById = Warehouse.findProductById(scanner);
                Warehouse.removeProduct(productById);

                break;
            case 3:
                Warehouse.showSupplies();
                break;
            case 4:
                Warehouse.showSumOfProducts();
                break;
            case 5:
                Warehouse.updateProductAmount(scanner);
                break;
            case 6:
                System.out.println("Wychodzę....");
                break;
            default:
                System.out.println("Takiej akcji nie obsługujemy");

        }

        return choice;
    }


}
