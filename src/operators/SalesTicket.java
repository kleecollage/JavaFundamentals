package operators;

import java.util.Scanner;

public class SalesTicket {
    public static void main(String[] args) {
        var console = new Scanner(System.in);

        System.out.print("Milk price: ");
        var milkPrice = Double.parseDouble(console.nextLine());

        System.out.print("Bread price: ");
        var breadPrice = Double.parseDouble(console.nextLine());

        System.out.print("Lettuce price: ");
        var lettucePrice = Double.parseDouble(console.nextLine());

        System.out.print("Banana price: ");
        var bananaPrice = Double.parseDouble(console.nextLine());

        System.out.print("Apply discount (%)? ");
        var discountPercentage = Integer.parseInt(console.nextLine());

        // Results
        var subtotal = milkPrice + breadPrice + lettucePrice + bananaPrice;
        var discount = subtotal * ((double) discountPercentage /100);
        var subtotalWithDiscount = subtotal - discount;
        var tax = subtotalWithDiscount * 0.16;
        var total = tax + subtotalWithDiscount;

        System.out.printf("""
                -----   Ticket   -----
                Subtotal: $%.2f
                Discount: $%.2f (%d%%)
                IVA (%%16): $%.2f
                Total: $%.2f
                -----------------------
                """, subtotal, discount, discountPercentage, tax, total);
    }
}
