package dodatkowe_zadania.java_podstawy_dzien_trzeci;

import java.util.Scanner;

public class ToolStorage {


    public static void main(String[] args) {
        String[] toolsToBuy = {"kombinerki", "nożyczki", "śrubokręt"};

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        String choice = "";


        while (!choice.equals("Do widzenia")) {
            choice = buyItem(scanner, userName, toolsToBuy);
        }
    }

    private static String buyItem(Scanner scanner, String userName, String... toolsToBuy) {

        System.out.println("Witaj " + userName + ". W ofercie mamy:");

        for (String tool : toolsToBuy) {
            if (tool != "") {
                System.out.println("- " + tool);
            }
        }

        System.out.println("Co chciałbyś kupić?");
        String chosenTool = scanner.nextLine();
        switch (chosenTool) {
            case "kombinerki":
            case "śrubokręt":
            case "nożyczki":
                removeChosenItem(toolsToBuy, chosenTool);
                System.out.println("Kupiono " + chosenTool);
            case "Do widzenia":
                break;
            default:
                System.out.println("Takiego produktu nie ma w ofercie");

        }

        return chosenTool;
    }

    private static void removeChosenItem(String[] toolsToBuy, String chosenTool) {
        for (int i = 0; i < toolsToBuy.length; i++) {
            if (toolsToBuy[i].equals(chosenTool)) {
                toolsToBuy[i] = "";
            }
        }
    }
}
