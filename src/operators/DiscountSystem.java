package operators;

import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {
        final var NO_PRODUCTS_DISCOUNT = 10;
        var console = new Scanner(System.in);

        System.out.print("How much products do you buy today?");
        var stockProducts = Integer.parseInt(console.nextLine());

        System.out.print("Have your membership (true/false)?");
        var isMember = Boolean.parseBoolean(console.nextLine());

        var hasDiscount = stockProducts >= NO_PRODUCTS_DISCOUNT && isMember;
        System.out.println("Have discount: " + hasDiscount);
    }
}
