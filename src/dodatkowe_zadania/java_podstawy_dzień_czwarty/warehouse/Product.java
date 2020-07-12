package dodatkowe_zadania.java_podstawy_dzień_czwarty.warehouse;

public class Product {


    private int id = counter++;
    private String type;
    private String name;
    private int price;
    private int amount;
    private static int counter;

    public Product(String type, String name, int price, int amount) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
