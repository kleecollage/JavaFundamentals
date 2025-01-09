package snacks_files.presentation;

import snacks_files.domain.Snack;
import snacks_files.service.ISnacksService;
import snacks_files.service.SnacksServiceFile;
import snacks_files.service.SnacksServiceList;

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
        // SNACKS SERVICE
        // ISnacksService snacksService = new SnacksServiceList();
        ISnacksService snacksService = new SnacksServiceFile();
        // CREATE NEW PRODUCT LIST<SNACK>
        List<Snack> products = new ArrayList<>();
        System.out.println(" *** WELCOME *** ");
        snacksService.showSnacks();

        while(!exit) {
            try {
                var option = showMenu(console);
                exit = execOptions(option, console, products, snacksService);
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

    private static boolean execOptions(int option, Scanner console, List<Snack> products, ISnacksService snacksService) {
        var exit = false;

        switch(option) {
            case 1 -> buySnack(console, products, snacksService);
            case 2 -> showTicket(products);
            case 3 -> addSnack(console, snacksService);
            case 4 -> exit = true;
            default -> System.out.println("Invalid option");
        }

        return exit;
    }

    private static void buySnack(Scanner console, List<Snack> products, ISnacksService snacksService) {
        System.out.print("Select the id of the snack you'd like to buy: ");
        var idSelected = Integer.parseInt(console.nextLine());
        // Validation
        var snackFound = false;
        for (var snack : snacksService.getSnacks()) {
            if (idSelected == snack.getIdSnack()) {
                products.add(snack);
                System.out.println("Snack Added: " + snack.getNameSnack());
                snackFound = true;
                break;
            }
        }
        if (!snackFound)
            System.out.println("Snack with id " + idSelected + " not found");
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

    private static void addSnack(Scanner console, ISnacksService snacksService) {
        System.out.print("Enter the name of the snack: ");
        var name = console.nextLine();

        System.out.print("Enter the price of the snack: ");
        var price = Double.parseDouble(console.nextLine());

        snacksService.addSnack(new Snack(name, price));
        System.out.println("New Snack Added!");
        snacksService.showSnacks();
    }
}
