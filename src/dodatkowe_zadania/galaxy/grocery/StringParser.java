package dodatkowe_zadania.galaxy.grocery;

public class StringParser {


    public static boolean validateName(String name) {
        return name.matches("[A-Z]\\w+");
    }

    public static boolean validateAmountOfMoney(String amount) {
        return amount.matches("\\d+");
    }


    public static Product[] mapStringToProducts(String productsInString) {

        String[] products = productsInString.split(";");

        boolean areProductsValid;
        Product[] objectProducts = new Product[5];

        for (String string : products) {
            if (!string.matches("[a-z]{1,20}") || products.length > 5) {
                return objectProducts;
            }
        }

        int arraySize = 0;

        for (String string : products) {
            switch (string) {
                case "egg":
                    objectProducts[arraySize] = new Egg();
                    arraySize++;
                    break;
                case "tomato":
                    objectProducts[arraySize] = new Tomato();
                    arraySize++;
                    break;
                case "butter":
                    objectProducts[arraySize] = new Butter();
                    arraySize++;
                    break;
                case "bread":
                    objectProducts[arraySize] = new Bread();
                    arraySize++;
                    break;
                default:
                    break;

            }
        }

        return objectProducts;
    }
}
