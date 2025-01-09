package snacks_files.service;

import snacks_files.domain.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SnacksServiceFile implements ISnacksService {
    private final String FILE_NAME = "snacks.txt";
    // Create Snacks Lists
    private List<Snack> snacks = new ArrayList<>();
    // CONSTRUCTOR
    public SnacksServiceFile() {
        // CREATE FILE IF NOT EXISTS
        var file = new File(FILE_NAME);
        var exists = false;
        try {
            exists = file.exists();
            if (exists) {
                this.snacks = getSnacksFile();
            } else {
                var output = new PrintWriter(new FileWriter(file));
                output.close();
                System.out.println("File created");
            }
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        // IF FILE NOT EXISTS. LOAD DATA
        if (!exists) {
            loadInitialSnacks();
        }

    }

    private void loadInitialSnacks() {
        this.addSnack(new Snack("Chips", 2.25));
        this.addSnack(new Snack("Soda", 2.75));
        this.addSnack(new Snack("Sandwich", 4.35));
    };

    @Override
    public void addSnack(Snack snack) {
        // Add new snack to memory
        this.snacks.add(snack);
        // Add new snack in file
        this.addSnackFile(snack);
    }

    private void addSnackFile(Snack snack) {
        boolean append = false;
        var file = new File(FILE_NAME);
        try {
            append = file.exists();
            var output = new PrintWriter(new FileWriter(file, append));
            output.println(snack.writeSnack());
            output.close();
            System.out.println("Snack added to file");
        } catch (Exception e) {
            System.out.println("Error adding snack: " + e.getMessage());
        }
    }

    private List<Snack> getSnacksFile() {
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            for(String line : lines) {
                String[] snackLine = line.split(",");
                var idSnack = snackLine[0];
                var name = snackLine[1];
                var price = Double.parseDouble(snackLine[2]);
                var snack = new Snack(name, price);
                snacks.add(snack);
            }
        } catch (Exception e) {
            System.out.println("Error reading snacks file: " + e.getMessage());
            e.printStackTrace();
        }

        return snacks;
    }

    @Override
    public void showSnacks() {
        System.out.println(" --- Snacks Available --- ");
        // Show snacks from file
        var inventorySnacks = "";
        for(var snack : this.snacks) {
            inventorySnacks += snack.toString() + "\n";
        }
        System.out.println(inventorySnacks);
    }


    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }

}
