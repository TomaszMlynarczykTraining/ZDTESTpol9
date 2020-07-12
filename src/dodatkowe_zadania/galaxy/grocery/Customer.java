package dodatkowe_zadania.galaxy.grocery;

public class Customer {

    private Product[] products;
    private String name;
    private double amountOfMoney;
    private int numberOfStoreVisits;
    private int id;
    private static int numberOfObjects;

    public Customer(Product[] products, String name, double amountOfMoney, int numberOfStoreVisits) {
        this.products = products;
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.numberOfStoreVisits = numberOfStoreVisits;
        id = numberOfObjects++;
    }


    public void showListOfProducts() {
        System.out.println("Customer of id " + id + " bought");
        for (Product product : products) {
            if (product != null)
                System.out.println(product.getName());
        }
    }

    public void showSumOfProducts() {
        int price = 0;

        for (Product product : products) {
            if (product != null)
                price += product.getPrice();
        }

        System.out.println("Customer of id " + id + " bought products of price of " + price);
    }
}
