package fit_zone.presentation;

import fit_zone.data.ClientDAO;
import fit_zone.data.IClientDAO;
import fit_zone.domain.Client;

import java.util.Scanner;

public class FitZoneApp {
    public static void main(String[] args) {
        fitZoneApp();
    }

    private static void fitZoneApp() {
        IClientDAO clientDao = new ClientDAO();
        var console = new Scanner(System.in);
        var exit = false;

        while (!exit) {
            try {
                var option = showMenu(console);
                exit = executeOptions(console, option, clientDao);
            } catch (Exception e) {
                System.out.println("Error executing options: " + e.getMessage());
            }
        }
    }

    // RETURN OPTION SELECTED
    private static int showMenu(Scanner console) {
        System.out.println("\n *** Welcome to FitZone! ***");
        System.out.print("""
                Menu:
                \t1. Clients List
                \t2. Search Client By ID
                \t3. Add New Client
                \t4. Update Client
                \t5. Delete Client
                \t6. Exit
                Enter your choice:\s""");
        return Integer.parseInt(console.nextLine());
    }

    // OPTIONS LOGIC
    private static boolean executeOptions(Scanner console, int option, IClientDAO clientDao) {
        var exit = false;

        switch (option) {
            case 1 -> {
                System.out.println("\n.::List Clients::.");
                clientDao.listClients().forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("\n.::Search Client By ID::.");
                isInDb(clientDao, console);
            }
            case 3 -> {
                System.out.println("\n.::Add New Client::.");
                var newClient = clientForm(console);
                clientDao.addClient(newClient);
                System.out.println(" New Client: " + newClient);
            }
            case 4 -> {
                System.out.println("\n.::Update Client::.");
                var idClient = isInDb(clientDao, console);
                var clientToUpdate = clientForm(console);
                clientToUpdate.setId(idClient);
                clientDao.updateClient(clientToUpdate);
                System.out.println("Client updated: " + clientToUpdate);
            }
            case 5 -> {
                System.out.println("\n.::Delete Client::.");
                var idClient = isInDb(clientDao, console);
                var clientToDelete = new Client(idClient);
                clientDao.deleteClient(clientToDelete);
                System.out.println("Client deleted: " + clientToDelete);
            }
            case 6 -> exit = true;
            default -> System.out.println("Invalid option");
        }

        return exit;
    }

    private static int isInDb(IClientDAO clientDao, Scanner console) {
        System.out.print("Enter client id: ");
        var idClient = Integer.parseInt(console.nextLine());
        var client = new Client(idClient);
        var found = clientDao.searchClientById(client);
        if (found)
            System.out.println("Current Client: " + client);
        else
            System.out.println("OOPS. Client not found");

        return idClient;
    }

    private static Client clientForm(Scanner console) {
        System.out.print("Enter client name: ");
        var nameClient = console.nextLine();

        System.out.print("Enter client lastname: ");
        var lastnameClient = console.nextLine();

        System.out.print("Enter the client membership number: ");
        var membershipClient = Integer.parseInt(console.nextLine());

        return new Client(nameClient, lastnameClient, membershipClient);
    }
}
