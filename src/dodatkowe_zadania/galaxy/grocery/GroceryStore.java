package dodatkowe_zadania.galaxy.grocery;

import java.util.Scanner;

public class GroceryStore {

    private static Customer[] customers = new Customer[5];
    private static int acutalNumberOfClients = 0;

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 4) {
            choice = performAction();
        }
    }

    private static int performAction() {


        System.out.println("Co chciałbyś zrobić (1-4)");
        System.out.println("1. Dodaj klienta");
        System.out.println("2. Wyświetl liste zakupow klienta");
        System.out.println("3. Suma zakupow klienta");
        System.out.println("4. Wyjdź");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addClient(scanner);
                break;
            case 2:
                showClient(scanner);
                break;
            case 3:
                sumProducts(scanner);
                break;
            default:
                break;
        }
        return choice;
    }

    private static void showClient(Scanner scanner) {
        System.out.println("Podaj id");
        int id = scanner.nextInt();

        customers[id].showListOfProducts();
    }

    private static void sumProducts(Scanner scanner) {
        System.out.println("Podaj id");
        int id = scanner.nextInt();
        customers[id].showSumOfProducts();

    }


    private static void addClient(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj liczbe pieniedzy");
        String amount = scanner.nextLine();
        System.out.println("Podaj produkty");
        String shopList = scanner.nextLine();

        Product[] products = StringParser.mapStringToProducts(shopList);

        if (shopList.length() == 0 || !StringParser.validateAmountOfMoney(amount) || !StringParser.validateName(name)) {
            System.out.println("Niepoprawne dane klienta, sproboj jeszcze raz");
        } else {
            customers[acutalNumberOfClients] = new Customer(products, name, Double.parseDouble(amount), 0);
        }

    }
}
