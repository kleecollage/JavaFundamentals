package snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnacksMachine {
    public static void main(String[] args) {
        snacksMachine();
    }

    public static void snacksMachine() {
        var console = new Scanner(System.in);
        var exit = false;
        List<Snack> products = new ArrayList<>();
        System.out.println(" *** WELCOME *** ");
        Snacks.showSnacks();

        while(!exit) {
            try {
                var option = showMenu(console);
                exit = execOptions(option, console, products);
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e);
            } finally {
                System.out.println();
            }
        }
    }

    public static int showMenu(Scanner console) {
        System.out.print("""
                ...:: Snacks Machine ::...
                Menu:
                1. Buy Snacks
                2. Show Ticket
                3. Add New Snack
                4. Exit
                Choose an option:\s""");
        return Integer.parseInt(console.nextLine());
    }

    private static boolean execOptions(int option, Scanner console, List<Snack> products) {
        var exit = false;

        switch(option) {
            case 1 -> buySnack(console, products);
            case 2 -> showTicket(products);
            case 3 -> addSnack(console);
            case 4 -> exit = true;
            default -> System.out.println("Invalid option");
        }

        return exit;
    }

    private static void buySnack(Scanner console, List<Snack> products) {
        System.out.println("Select the id of the snack you'd like to buy: ");
        var idSelected = console.nextInt();
        // Validation
        var snackFound = false;
        for (var snack: Snacks.getSnacks()) {
            if (idSelected == snack.getIdSnack()){
                products.add(snack);
                System.out.println("Snack Added: " + snack.getNameSnack());
                snackFound = true;
                break;
            }
        }
        if (!snackFound)
            System.out.println("Snack with id " + idSelected +  " not found");
    }

    private static void showTicket(List<Snack> products) {
        var ticket = " *** Ticket *** ";
        var total = 0.0;
        for(var product: products) {
            ticket += "\n\t- " + product.getNameSnack() + " - $" + product.getPriceSnack();
            total += product.getPriceSnack();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void addSnack(Scanner console) {
        System.out.print("Enter the name of the snack: ");
        var name = console.nextLine();

        System.out.print("Enter the price of the snack: ");
        var price = Double.parseDouble(console.nextLine());

        Snacks.addSnack(new Snack(name, price));
        System.out.println("New Snack Added!");
        Snacks.showSnacks();
    }
}
