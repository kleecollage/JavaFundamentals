package snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks extends Snack {
    private static final List<Snack> snacks;

    // Static block initializer
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Chips", 3.25));
        snacks.add(new Snack("Soda", 4.70));
        snacks.add(new Snack("Sandwich", 5.00));
    }

    public static void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void showSnacks() {
        var inventorySnacks = "";
        for(var snack : snacks) {
            inventorySnacks += snack.toString() + "\n";
        }
        System.out.println(" --- Snacks Available ---");
        System.out.println(inventorySnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
}
